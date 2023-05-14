SUMMARY = "CompuLab 4.19.35 kernel"
DESCRIPTION = "Linux kernel for CompuLab imx6 boards."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.15_1.0.0_ga"
LOCALVERSION = "-cl-1.0"
KERNEL_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "a4d2a08f3bfc57ff5d7d1307fb23f52f1e681aca"

S = "${WORKDIR}/git"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "cm-fx6-evk"

PR = "r1"
