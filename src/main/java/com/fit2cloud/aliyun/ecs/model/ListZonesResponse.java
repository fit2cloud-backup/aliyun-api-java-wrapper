package com.fit2cloud.aliyun.ecs.model;

import java.util.List;

public class ListZonesResponse extends Response {
	private Zones Zones;

	public Zones getZones() {
		return Zones;
	}
	
	public class Zones {
		List<Zone> Zone;

		public List<Zone> getList() {
			return Zone;
		}

		public class Zone {
			private String ZoneId;
			private String LocalName;
			private String SupportedDiskCategories;
			
			public String getSupportedDiskCategories() {
				return SupportedDiskCategories;
			}
			public void setSupportedDiskCategories(String supportedDiskCategories) {
				SupportedDiskCategories = supportedDiskCategories;
			}
			public String getZoneId() {
				return ZoneId;
			}
			public void setZoneId(String ZoneId) {
				this.ZoneId = ZoneId;
			}
			public String getLocalName() {
				return LocalName;
			}
			public void setLocalName(String localName) {
				this.LocalName = localName;
			}
			@Override
			public String toString() {
				return "Zone [ZoneId=" + ZoneId + ", LocalName=" + LocalName
						+ ", SupportedDiskCategories="
						+ SupportedDiskCategories + "]";
			}
		}
	}

}
