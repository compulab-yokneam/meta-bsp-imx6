#!/bin/bash -x

pkill -9 gst-launch

for blank in 1 0;do
    sleep .5
    echo ${blank} | tee $(ls /sys/class/graphics/fb*/blank)
done

for fb in /sys/class/graphics/fb[0-9];do
	fb=$(basename ${fb})
	disp_type=$(cat /sys/class/graphics/${fb}/fsl_disp_dev_property)
	[[ ${disp_type} == 'overlay' ]] && continue
	sleep .5
	eval $(awk -F"," '$0="x="$1";y="$2' /sys/class/graphics/${fb}/virtual_size)
	# gst-launch-1.0 videotestsrc ! "video/x-raw,width=${x},height=${y}" ! textoverlay text="'${fb}-${disp_type}'" ! fbdevsink device=/dev/${fb} &
	gst-launch-1.0 videotestsrc ! "video/x-raw,width=${x},height=${y}" ! fbdevsink device=/dev/${fb} &
done
