SUMMARY = "CompuLab 4.14.98 kernel"
DESCRIPTION = "Linux kernel for CompuLab imx6 boards."

require recipes-kernel/linux/linux-imx.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.14.98_2.0.0_ga"
LOCALVERSION = "-cl-2.0"
LOCALVERSION = "-${SRCBRANCH}"
KERNEL_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "5d6cbeafb80c52af322a45985aa7b41f9b9ec66c"

S = "${WORKDIR}/git"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "cl-som-imx6"
