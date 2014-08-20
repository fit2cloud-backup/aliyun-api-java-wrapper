package com.fit2cloud.aliyun.ecs.model;

public class MonitorData {
	private String InstanceId;
	private Double CPU;
	private Integer Memory;
	private Integer IntranetRX;
	private Integer IntranetTX;
	private Integer IntranetFlow;
	private Integer IntranetBandwidth;
	private Integer InternetRX;
	private Integer InternetTX;
	private Integer InternetFlow;
	private Integer InternetBandwidth;
	private Integer IOPSRead;
	private Integer IOPSWrite;
	private Integer BPSRead;
	private Integer BPSWrite;
	private String TimeStamp;

	public String getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(String instanceId) {
		InstanceId = instanceId;
	}

	public Double getCPU() {
		return CPU;
	}

	public void setCPU(Double cPU) {
		CPU = cPU;
	}

	public Integer getMemory() {
		return Memory;
	}

	public void setMemory(Integer memory) {
		Memory = memory;
	}

	public Integer getIntranetRX() {
		return IntranetRX;
	}

	public void setIntranetRX(Integer intranetRX) {
		IntranetRX = intranetRX;
	}

	public Integer getIntranetTX() {
		return IntranetTX;
	}

	public void setIntranetTX(Integer intranetTX) {
		IntranetTX = intranetTX;
	}

	public Integer getIntranetFlow() {
		return IntranetFlow;
	}

	public void setIntranetFlow(Integer intranetFlow) {
		IntranetFlow = intranetFlow;
	}

	public Integer getIntranetBandwidth() {
		return IntranetBandwidth;
	}

	public void setIntranetBandwidth(Integer intranetBandwidth) {
		IntranetBandwidth = intranetBandwidth;
	}

	public Integer getInternetRX() {
		return InternetRX;
	}

	public void setInternetRX(Integer internetRX) {
		InternetRX = internetRX;
	}

	public Integer getInternetTX() {
		return InternetTX;
	}

	public void setInternetTX(Integer internetTX) {
		InternetTX = internetTX;
	}

	public Integer getInternetFlow() {
		return InternetFlow;
	}

	public void setInternetFlow(Integer internetFlow) {
		InternetFlow = internetFlow;
	}

	public Integer getInternetBandwidth() {
		return InternetBandwidth;
	}

	public void setInternetBandwidth(Integer internetBandwidth) {
		InternetBandwidth = internetBandwidth;
	}

	public Integer getIOPSRead() {
		return IOPSRead;
	}

	public void setIOPSRead(Integer iOPSRead) {
		IOPSRead = iOPSRead;
	}

	public Integer getIOPSWrite() {
		return IOPSWrite;
	}

	public void setIOPSWrite(Integer iOPSWrite) {
		IOPSWrite = iOPSWrite;
	}

	public Integer getBPSRead() {
		return BPSRead;
	}

	public void setBPSRead(Integer bPSRead) {
		BPSRead = bPSRead;
	}

	public Integer getBPSWrite() {
		return BPSWrite;
	}

	public void setBPSWrite(Integer bPSWrite) {
		BPSWrite = bPSWrite;
	}

	public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "MonitorData [InstanceId=" + InstanceId + ", CPU=" + CPU
				+ ", Memory=" + Memory + ", IntranetRX=" + IntranetRX
				+ ", IntranetTX=" + IntranetTX + ", IntranetFlow="
				+ IntranetFlow + ", IntranetBandwidth=" + IntranetBandwidth
				+ ", InternetRX=" + InternetRX + ", InternetTX=" + InternetTX
				+ ", InternetFlow=" + InternetFlow + ", InternetBandwidth="
				+ InternetBandwidth + ", IOPSRead=" + IOPSRead + ", IOPSWrite="
				+ IOPSWrite + ", BPSRead=" + BPSRead + ", BPSWrite=" + BPSWrite
				+ ", TimeStamp=" + TimeStamp + "]";
	}
}
