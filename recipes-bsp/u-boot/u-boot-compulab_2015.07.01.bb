DESCRIPTION = "Compulab i.MX6 U-Boot"
require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

SECTION = "bootloader"
PROVIDES += "u-boot"

UBOOT_SRC ?= "git://github.com/compulab/u-boot.git;protocol=https"
SRCBRANCH = "2015.07-cm-fx6-3"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
"
SRCREV = "v2015.07-cm-fx6-3.1"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "cl-som-imx6"
