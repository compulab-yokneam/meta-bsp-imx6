SRCREV = "003c4fb469aa7fd21017b6dc24cd5e5de3b4ffe3"

SRC_URI_append_cl-som-imx6 = " \
    file://0001-cm_fx6-config-Add-PHY_REALTEK-and-PHY_FIXED.patch \
    file://0002-phy-Add-phy-vendor-specific-rework.patch \
    file://0003-cm_fx6-Report-the-DRAM-size-as-a-U-Boot-environment-.patch \
    file://0004-cm-fx6-phy-Fix-led.patch \
    file://0005-cl-som-imx6-defconfig-Enable-MEMTEST-MEMINFO.patch \
    file://0006-compulab-imx6-Enable-ESDHC4-for-CL_SOM_IMX6-target-o.patch \
    file://0007-cl-som-imx6-defconfig-Update-LOCALVERSION-to-1.2.patch \
"
