#!/bin/bash -x

pkill -9 gst-launch
for fb in /sys/class/graphics/fb[0-9];do
	fb=$(basename ${fb})
	echo 1 > /sys/class/graphics/${fb}/blank
	sleep 1
	gst-launch-1.0 videotestsrc ! fbdevsink device=/dev/${fb} &
	sleep 1
	echo 0 > /sys/class/graphics/${fb}/blank
done
