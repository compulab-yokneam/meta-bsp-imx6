SUMMARY = "CompuLab 4.14.98 kernel"
DESCRIPTION = "Linux kernel for CompuLab imx6 boards."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-imx-src-${PV}.inc
LOCALVERSION = "-cl-1.0"

DEPENDS += "lzop-native bc-native"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "cl-som-imx6"
# EXTRA_OEMAKE_append_mx6 = " ARCH=arm"
