# Append path for freescale layer to include bsp xorg.conf 
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_remove = "file://xorg.conf"
SRC_URI += "file://xorg.imx6.conf"

do_configure_append() {
	cp ${S}/xorg.imx6.conf ${S}/xorg.conf
}
