DESCRIPTION = "Compulab i.MXi6 U-Boot"
require recipes-bsp/u-boot/u-boot.inc
inherit pythonnative

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

PROVIDES += "u-boot"
DEPENDS_append = " dtc-native"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

UBOOT_SRC ?= "git://source.codeaurora.org/external/imx/uboot-imx.git;protocol=https"
SRCBRANCH = "imx_v2020.04_5.4.24_2.1.0"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH} \
"
SRCREV = "4979a99482f7e04a3c1f4fb55e3182395ee8f710"

S = "${WORKDIR}/git"

LOCALVERSION = "-5.4.24-2.1.0-compulab"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(cl-som-imx6)"
