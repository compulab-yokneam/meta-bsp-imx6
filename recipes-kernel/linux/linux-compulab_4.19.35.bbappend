FILESEXTRAPATHS_prepend := "${THISDIR}/linux-compulab-${PV}/imx6:"

require linux-compulab-${PV}/imx6.inc

MACHINE_DEFCONFIG_cl-som-imx6   = "cl-som-imx6_defconfig"
MACHINE_DEFCONFIG_cl-som-imx6ul = "cl-som-imx6ul_defconfig"
MACHINE_DEFCONFIG_cm-fx6-evk    = "cm_fx6_defconfig"

do_configure_append () {
    oe_runmake ${MACHINE_DEFCONFIG}
}
