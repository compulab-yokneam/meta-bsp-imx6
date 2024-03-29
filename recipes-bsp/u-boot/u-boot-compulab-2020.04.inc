LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

UBOOT_SRC = "git://github.com/nxp-imx/uboot-imx.git;protocol=https"
SRCBRANCH = "imx_v2020.04_5.4.24_2.1.0"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "4979a99482f7e04a3c1f4fb55e3182395ee8f710"

UBOOT_MACHINE_cl-som-imx6 = "cl-som-imx6_defconfig"
UBOOT_MACHINE_cm-fx6-evk  = "cm_fx6_defconfig"
