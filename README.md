# SkinChangeDemo

# 背景：Application的onCreate中耗时操作时，导致启动白屏一段时间，使用了官方推荐的方案：http://wuxiaolong.me/2017/03/13/appStart/
所以添加了闪屏逻辑：给SplashActivity设置theme->windowBackgroud，这样可以先显示和SplashActivity一样的背景图片，用于品牌展示或广告用途

所以现在app启动时有分为两步，第一步：闪屏的图片/颜色(换肤失败)，第二步：SplashActivity的背景换肤成功

