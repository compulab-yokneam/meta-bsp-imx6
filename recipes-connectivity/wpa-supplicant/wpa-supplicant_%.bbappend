FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# SRC_URI += "file://wpa_supplicante.sme.patch"

do_configure_append() {
	echo "CONFIG_FILS=y" >> wpa_supplicant/.config
}

