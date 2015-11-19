/*
 * Copyright (C) 2012 The CeHu Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.control;

public class PromptString {
	public static String[] str =  {
		"click(int x, int y)",
		"click(String text)",
		"clickAndWaitForNewWindow(String text, long timeout)",
		"clickByClass(String object, int instance)",
		"clickById(String id, int instance)",
		"compare(String filePath, int rate)",
		"findElementByXpath(String xpath)",
		"getActivityName()",
		"getPageSource()",
		"getSerialNumber()",
		"install(String filePath)",
		"invoke(String pyPath, String method, Object[] args)",
		"logInfo(String log)",
		"longClick(int x, int y)",
		"longClick(String text)",
		"pressBack()",
		"pressDelete()",
		"pressDPadCenter()",
		"pressDPadDown()",
		"pressDPadLeft()",
		"pressDPadRight()",
		"pressDPadUp()",
		"pressEnter()",
		"pressHome()",
		"pressKeyCode(int keyCode, int metaState)",
		"pressKeyWords(String str)",
		"pressMenu()",
		"reboot()",
		"registerWatcher(String name, String path, String func)",
		"removeWatcher(String name)",
		"script(int width, int height)",
		"scrollToBeginning(int maxSwipes)",
		"scrollToEnd(int maxSwipes)",
		"setTextByClass(String object, int instance, String text)",
		"setTextById(String id, int instance, String text)",
		"sendKeysByXpath(String xpath, String text)",
		"sleep(long millisec)",
		"startActivity(String activityName)",
		"startURL(String url)",
		"swipe(int startX, int startY, int endX, int endY)",
		"switchToWindow(String window)",
		"takeSnapshot(String path, String fileName)",
		"findText(String text)",
		"triggerWatchers()",
		"getWebDriver()",
		"Tap(By)",
		"tapByXpath(String xpath)"
	};
		
	public static String[] str2 = {
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"String",
		"String",
		"String",
		"boolean",
		"void",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"void",
		"boolean",
		"void",
		"void",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"boolean",
		"void",
		"boolean",
		"boolean",
		"boolean",
		"void",
		"String",
		"boolean",
		"void",
		"WebDriver",
		"boolean",
		"boolean"
	};
	
	public static String[] str3 = {
		"点击坐标\n\n参数:\nint x - x坐标\nint y - y坐标\n\n返回值:true - 点击成功    false - 点击失败",
		"点击文本\n\n参数:\nString text - 文本文字\n\n返回值:true - 点击成功    false - 点击失败",
		"点击文本并等待新窗口\n\n参数:\nString text - 文本文字\nlong timeout - 等待超时\n\n返回值:true - 点击成功    false - 点击失败",
		"点击控件属性\n\n参数:\nString object - 控件属性\nint instance - 第n个控件\n\n返回值:true - 点击成功    false - 点击失败",
		"点击控件id\n\n参数:\nString object - 控件属性\nint instance - 第n个控件\n\n返回值:true - 点击成功    false - 点击失败",
		"图片比较\n\n参数:\nString filePath - 原图相对路径\nint rate - 相似度\n\n返回值:true - 比较成功  false - 比较失败\n\n",
		"根据xpath查找目标",
		"获得被测Apk的Activity名",
		"获得WebView页面的Dom元素",
		"获得被测手机的Serial Number\n\n返回值:被测手机的序列号",
		"安装应用程序\n\n参数:\nString filePath - app路径\n\n返回值:true - 安装成功  false - 安装失败",
		"调用自定义库函数\n\n参数:\nString pyPath - Python脚本路径\nString method - 方法名",
		"记录Log日志\n\n参数:String str - 日志文本\n\n返回值:true - 记录成功  false - 记录失败",
		"长按点击坐标\n\n参数:\nint x - x坐标\nint y - y坐标\n\n返回值:true - 点击成功    false - 点击失败",
		"长按点击文本\n\n参数:\nString text - 文本文字\n\n返回值:true - 点击成功    false - 点击失败",
		"模拟返回键\n\n返回值:true - 返回成功  false - 返回失败",
		"模拟删除按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"模拟按轨迹球中点按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"模拟按轨迹球下点按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"模拟按轨迹球左点按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"模拟按轨迹球右点按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"模拟按轨迹球上点按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"模拟回车按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"模拟HOME按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"发送KeyCode按键\n\n参数:int keyCode - 键盘KeyCode值   int metaState - 大小写(1大写  0小写)\n\n返回值:true - 发送成功  false - 发送失败",
		"根据字符发送KeyCode按键\n\n参数:String str - 需要输入的字符串\n\n返回值:true - 发送成功  false - 发送失败",
		"模拟MENU按键\n\n返回值:true - 模拟成功  false - 模拟失败",
		"重启设备\n\n返回值:true - 点击成功    false - 点击失败",
		"注册Watcher监听\n\n返回值:void",
		"注销监听器\n\n参数:String name - 监听器名",
		"设置当前脚本对应的屏幕大小,在用到坐标的地方会自动进行不同屏幕适配",
		"滚屏至屏幕底",
		"滚屏至屏幕顶",
		"设置指定控件的文本\n\n参数:\nString object - Class属性\nint instance - 第n个\nString text - 设置的文本\n\n返回值:true - 设置成功  false - 设置失败",
		"设置指定控件的文本\n\n参数:\nString id - 控件id属性\nint instance - 第n个\nString text - 设置的文本\n\n返回值:true - 设置成功  false - 设置失败",
		"设置指定控件的文本\n\n参数:\nString xpath - 控件xpath属性\nString text - 设置的文本\n\n返回值:true - 设置成功  false - 设置失败\n\n for WebView",
		"等待\n\n参数:\nlong millisec - 等待时间(毫秒)\n返回值:void",
		"根据Activity名字启动应用程序\n\n参数:String activityName - Activity名字\n\n返回值:true - 启动成功  false - 启动失败",
		"根据URL名字启动应用程序,主要用于HTML5应用\n\n参数:String url - url名字\n\n返回值:true - 启动成功  false - 启动失败",
		"滑动屏幕\n\n参数:\nint startX - 开始点x坐标\nint startY - 开始点y坐标\nint endX - 结束点x坐标\nint endY - 结束点y坐标\n\n返回值:true - 滑动成功  false - 滑动失败",
		"切换测试模式\n\n参数:\nString window - 被测应用模式\n\n例如:switchToWindow('NATIVE_APP')\nswitchToWindow('WEBVIEW_0')",
		"获取屏幕快照\n\n参数:\nString path - 快照存储本地的路径\nString fileName - 快照名\n\n返回值:String - 成功返回改快照在本地的路径",
		"查找UI是否包含文本\n\n参数:\nString text - 文本文字\n\n返回值:true - 查找成功    false - 查找失败",
		"触发已经注册的Watcher\n\n",
		"获得WebDriver \n\n for WebView",
		"点击控件 \n\n for WebView",
		"按Xpath点击控件 \n\n for WebView"
	};
}
