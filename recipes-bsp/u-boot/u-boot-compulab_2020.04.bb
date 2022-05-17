DESCRIPTION = "Compulab i.MXi6 U-Boot"
require recipes-bsp/u-boot/u-boot.inc
inherit pythonnative

PROVIDES += "u-boot"
DEPENDS_append = " dtc-native"

require u-boot-compulab-2020.04.inc

require ${PN}-${PV}/mx6.inc

S = "${WORKDIR}/git"

LOCALVERSION = "-5.4.24-2.1.0-compulab"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(cl-som-imx6|cm-fx6-evk)"
