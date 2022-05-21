package com.snail.collie;

import com.snail.collie.battery.BatteryStatsTracker;
import com.snail.collie.fps.ITrackFpsListener;
import com.snail.collie.mem.MemoryLeakTrack;
import com.snail.collie.startup.LauncherTracker;
import com.snail.collie.trafficstats.ITrackTrafficStatsListener;

public interface CollieListener extends LauncherTracker.ILaunchTrackListener,  // 启动
        ITrackFpsListener,  // 卡顿
        MemoryLeakTrack.ITrackMemoryListener,// 内存
        ITrackTrafficStatsListener,  // 流量
        BatteryStatsTracker.IBatteryListener // 网络
{

}
