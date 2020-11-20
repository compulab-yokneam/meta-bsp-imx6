# CL-SOM-iMX6 Linux Kernel Building

Supported machines:

* `cl-som-imx6`

## Prerequisites
It is up to developer to setup arm build environment:
* Download a tool chain from [Linaro](https://releases.linaro.org/components/toolchain/binaries/latest-7/arm-linux-gnueabihf/)
* Set environment variables:
<pre>
export ARCH=arm
export CROSS_COMPILE=/usr/bin/arm-linux-gnueabihf-
</pre>
* Create a folder to organize the files:
<pre>
mkdir cl-som-imx6
cd cl-som-imx6
</pre>
* Download CompuLab BSP
<pre>
git clone -b master https://github.com/compulab-yokneam/meta-bsp-imx6.git
export PATCHES=$(pwd)/meta-bsp-imx6/recipes-kernel/linux/compulab/imx6
</pre>

# CompuLab Linux Kernel setup
<pre>
git clone https://source.codeaurora.org/external/imx/linux-imx.git
git -C linux-imx checkout -b linux-compulab rel_imx_4.14.98_2.0.0_ga
git -C linux-imx am ${PATCHES}/*.patch
</pre>

# Compile the Kernel
<pre>
make -C linux-imx cl-som-imx6_defconfig
make -C linux-imx
</pre>
