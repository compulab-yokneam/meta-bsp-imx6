require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot which includes support for CompuLab boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=0507cd7da8e7ad6d6701926ec9b84c95"

SECTION = "bootloader"
PROVIDES += "u-boot"

SRCBRANCH = "master"
SRCREV = "v2015.10"
SRC_URI = "git://git.denx.de/u-boot.git;branch=${SRCBRANCH}"
SRC_URI[md5sum] = "fd8234c5b3a460430689848c1f16acef"

SRC_URI += "file://0003-arm-imx6ul-add-u-boot-with-spl-cl.imx-target-for-cl-.patch \
	file://Fix-the-compile-issue-under-gcc6.patch \
	file://Fix-the-compile-issue-under-gcc7.patch \
	file://Fix-the-compile-issue-under-gcc8.patch \
"

require ${PN}-${PV}/cl-som-imx6ul.inc

S = "${WORKDIR}/git"

do_compile_append () {
	oe_runmake u-boot-with-spl-cl.imx
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "cl-som-imx6ul"
