FILESEXTRAPATHS_prepend := "${THISDIR}/linux-compulab-${PV}/imx6:"

require linux-compulab-${PV}/imx6.inc

do_configure_append () {
    oe_runmake ${MACHINE}_defconfig
}
