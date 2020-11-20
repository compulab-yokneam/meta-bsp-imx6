FILESEXTRAPATHS_prepend := "${THISDIR}/compulab/imx6:"

require compulab/imx6.inc

do_configure_append () {
    oe_runmake ${MACHINE}_defconfig
}
