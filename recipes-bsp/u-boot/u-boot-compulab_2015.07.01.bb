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
SRCREV = "003c4fb469aa7fd21017b6dc24cd5e5de3b4ffe3"

require ${PN}-${PV}/cl-som-imx6.inc

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "cl-som-imx6"
