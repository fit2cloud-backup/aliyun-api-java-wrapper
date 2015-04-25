package com.fit2cloud.aliyun.ecs.model.request;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fit2cloud.aliyun.Request;
import com.fit2cloud.aliyun.ecs.model.DataDisk;
import com.fit2cloud.aliyun.ecs.model.Instance;
import com.fit2cloud.aliyun.ecs.model.SystemDisk;
import com.google.gson.reflect.TypeToken;

public class CreateInstanceRequest extends Request {

	private Instance instance;
	private SystemDisk SystemDisk;
	private List<DataDisk> DataDisks;
	private String VSwitchId;

	public CreateInstanceRequest(Instance instance) {
		super();
		this.instance = instance;
	}

	public Instance getInstance() {
		return instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public SystemDisk getSystemDisk() {
		return SystemDisk;
	}

	public void setSystemDisk(SystemDisk systemDisk) {
		SystemDisk = systemDisk;
	}

	public List<DataDisk> getDataDisks() {
		return DataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		DataDisks = dataDisks;
	}

	public String getVSwitchId() {
		return VSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		VSwitchId = vSwitchId;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Map<String, String> toMap() {
		Type type = new TypeToken<HashMap<String, String>>(){}.getType();
		Map<String, String> map = new HashMap<String, String>();
		map.putAll((Map<? extends String, ? extends String>) gson.fromJson(gson.toJson(instance), type));
		
		if (SystemDisk != null) {
			if (SystemDisk.getCategory() != null) {
				map.put("SystemDisk.Category", SystemDisk.getCategory());
			}
			if (SystemDisk.getDiskName() != null) {
				map.put("SystemDisk.DiskName", SystemDisk.getDiskName());
			}
			if (SystemDisk.getDescription() != null) {
				map.put("SystemDisk.Description", SystemDisk.getDescription());
			}
		}
		if (DataDisks != null) {
			int count = 1;
			for (DataDisk disk : DataDisks) {
				map.put("DataDisk." + count + ".Size",
						String.valueOf(disk.getSize()));
				if (disk.getCategory() != null) {
					map.put("DataDisk." + count + ".Category",
							disk.getCategory());
				}
				if (disk.getSnapshotId() != null) {
					map.put("DataDisk." + count + ".SnapshotId",
							disk.getSnapshotId());
				}
				if (disk.getDiskName() != null) {
					map.put("DataDisk." + count + ".DiskName",
							disk.getDiskName());
				}
				if (disk.getDescription() != null) {
					map.put("DataDisk." + count + ".Description",
							disk.getDescription());
				}
				if (disk.getDevice() != null) {
					map.put("DataDisk." + count + ".Device", disk.getDevice());
				}
				count++;
			}
		}
		return map;
	}

	@Override
	public String toString() {
		return "CreateInstanceRequest [instance=" + instance + ", SystemDisk="
				+ SystemDisk + ", DataDisks=" + DataDisks + ", VSwitchId="
				+ VSwitchId + "]";
	}
}
