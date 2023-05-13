SRC_URI_append_cl-som-imx6 = " \
	file://0000-cl-som-imx6-dts-Add-the-SoM-dts.patch \
	file://0001-cl-som-imx6-mach-Add-the-SoM-mach-driver.patch \
	file://0002-cl-som-imx6-conf-Add-the-SoM-config.patch \
	file://0003-hci_bcm-Refactoring-the-bcm_setup.patch \
	file://0004-cl-som-imx6-dts-Remove-an-incorrect-clk-node.patch \
	file://0005-cl-som-imx6-defconfig-Enable-PCI.patch \
	file://defconfig \
"

SRC_URI_append_cl-som-imx6ul = " \
	file://0001-ARM-dts-imx7d-cl-som-imx7-fix-uart1-parent-clock.patch \
	file://0002-ARM-dts-imx7d-cl-som-imx7-fix-i2c2-configuration.patch \
	file://0003-ARM-dts-imx7d-cl-som-imx7-add-fec-phy-reset.patch \
	file://0004-ARM-dts-imx7d-cl-som-imx7-make-ethernet-work-again.patch \
	file://0005-ARM-dts-imx7d-cl-som-imx7-add-compatible-for-phy.patch \
	file://0006-ARM-dts-imx7d-cl-som-imx7-add-RTC-support.patch \
	file://0007-ARM-dts-imx7d-cl-som-imx7-add-support-for-gpio-led.patch \
	file://0008-ARM-dts-imx7d-cl-som-imx7-add-support-for-touchscree.patch \
	file://0009-ARM-dts-imx7d-cl-som-imx7-add-support-for-SPI-flash.patch \
	file://0010-ARM-dts-imx7d-cl-som-imx7-add-support-for-USB-host.patch \
	file://0011-ARM-dts-imx7d-cl-som-imx7-add-support-for-USB-hub.patch \
	file://0012-ARM-dts-imx7d-cl-som-imx7-add-support-for-watchdog.patch \
	file://0013-ARM-dts-imx7d-cl-som-imx7-add-support-for-NAND-flash.patch \
	file://0014-ARM-dts-imx7d-cl-som-imx7-add-WiLink8-WLAN-support.patch \
	file://0015-ARM-dts-imx7d-cl-som-imx7-add-WiLink-Bluetooth-suppo.patch \
	file://0016-ASoC-fsl-add-analog-audio-support-switch-for-imx-boa.patch \
	file://0017-ARM-dts-imx7d-cl-som-imx7-add-analog-audio-support.patch \
	file://0018-ARM-dts-imx7d-cl-som-imx7-disable-unsupported-operat.patch \
	file://0019-ARM-dts-imx7d-sbc-imx7-update-model-string.patch \
	file://0020-ARM-dts-imx7d-sbc-imx7-add-support-for-pwm-backlight.patch \
	file://0021-ARM-dts-imx7d-sbc-imx7-add-gpio-extender-support.patch \
	file://0022-ARM-dts-imx7d-sbc-imx7-add-support-for-baseboard-eep.patch \
	file://0023-ARM-dts-imx7d-sbc-imx7-add-LCD-support.patch \
	file://0024-ARM-dts-imx7d-sbc-imx7-add-DVI-support.patch \
	file://0025-ARM-dts-imx7d-sbc-imx7-add-CAN-bus-support.patch \
	file://0026-PCIe-imx6-imx7d-add-support-for-phy-refclk-source-co.patch \
	file://0027-ARM-dts-imx7d-sbc-imx7-enable-PCIe.patch \
	file://0028-ARM-dts-imx7d-sbc-imx7-enable-SB-SOM-peripheral.patch \
	file://0029-ARM-dts-imx7d-sbc-imx7-add-support-for-m4.patch \
	file://0030-ARM-dts-imx7d-sbc-iot-imx7-add-basic-board-support.patch \
	file://0031-ARM-dts-imx7d-sbc-iot-imx7-add-support-for-CAN-bus.patch \
	file://0032-ARM-imx7d-clk-select-uart7-clock-parent-and-set-rate.patch \
	file://0033-ARM-dts-imx7d-sbc-iot-imx7-add-support-for-RS485-in-.patch \
	file://0034-MLK-11395-9-video-mipi_dsi_samsung-add-MIPI-host-sid.patch \
	file://0035-video-mipi-panel-ti-sn65dsi83-add-MIPI-LVDS-bridge-d.patch \
	file://0036-ARM-imx7d-cl-som-imx7-dts-add-LVDS-support.patch \
	file://0037-rtc-em3027-correct-month-value.patch \
	file://0038-mtd-tests-nandecctest-add-dummy-module-parameter.patch \
	file://0039-ARM-configs-add-defconfig-for-compulab-imx7-based-de.patch \
	file://0040-cl-som-imx6ul-Add-SoM-support.patch \
	file://0041-cl-som-imx6ul-dts-Update-the-ecspi4-device-list.patch \
	file://defconfig \
"

SRC_URI_append_cm-fx6-evk = " \
	file://0000-cm-fx6-dts-Add-the-SoM-dts.patch \
	file://0001-cm-fx6-mach-Add-the-SoM-mach-driver.patch \
	file://0002-cm-fx6-conf-Add-the-SoM-config.patch \
	file://0003-cm-fx6-dts-Update-the-spi-flash-compatible-string.patch \
	file://0004-cm-fx6-mach-Disable-the-machine-init-code.patch \
	file://0005-cm-fx6-dts-Add-imx6q-sbc-fx6-multi.dts.patch \
	file://defconfig \
"
