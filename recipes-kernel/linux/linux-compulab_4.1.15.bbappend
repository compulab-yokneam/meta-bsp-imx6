FILESEXTRAPATHS_prepend := "${THISDIR}/linux-compulab-${PV}/${MACHINE}:"

require linux-compulab-${PV}/imx6.inc

MACHINE_DEFCONFIG_cm-fx6-evk = "cm_fx6_defconfig"

do_configure_append () {
    oe_runmake ${MACHINE_DEFCONFIG}
}
