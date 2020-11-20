# Configuring the build

## Setup Yocto environment

* WorkDir
```
mkdir compulab-bsp && cd compulab-bsp
```
* Set a CompuLab machine:
```
export MACHINE=cl-som-imx6
```

## Initialize repo manifests

* NXP
```
repo init -u git://source.codeaurora.org/external/imx/imx-manifest.git -b imx-linux-sumo -m imx-4.14.98-2.0.0_ga.xml
repo sync
```

* CompuLab
```
mkdir -p .repo/local_manifests
cd .repo/local_manifests
wget https://raw.githubusercontent.com/compulab-yokneam/meta-bsp-imx6/devel/scripts/meta-bsp-imx6.xml
cd -
```

* Sync Them all
```
repo sync
cd .repo/local_manifests
ln -sf ../../sources/meta-bsp-imx6/scripts/meta-bsp-imx6.xml .
cd -
```

## Setup build environment

* Initialize the build environment:
```
source sources/meta-bsp-imx6/tools/setup-env -b build-${MACHINE}
```
* Building the image:
```
bitbake -k fsl-image-qt5-validation-imx
```

## Deployment
### Create a bootable sd card

* Goto the `tmp/deploy/images/${MACHINE}` directory:
```
cd tmp/deploy/images/${MACHINE}
```

* Deploy the image:
```
bunzip -bc fsl-image-qt5-validation-imx-cl-som-imx6.sdcard.bz2 | sudo dd of=/dev/sdx bs=1M
```
