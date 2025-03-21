# IndicatorVIew
 
可用于 BannerView 与 ViewPager2 的指示器

https://github.com/user-attachments/assets/d5f7b2e5-4d9f-4a61-a91a-8759ecb37a7e



## 用法

```kotlin 
binding.pager.adapter = PagerAdapter(list)
binding.pager.setIndicator(binding.indicator.setWormMode().setSize(10.dp, activeWidth = 30.dp).setCornerRadius(5.dp))

binding.banner.setIndicator(IndicatorView(this))
binding.banner.setAdapter(BannerAdapter("Default")).start()
binding.banner.setData(list)

binding.banner1.setIndicator(
    IndicatorView(this).setWormMode()
        .setSize(10.dp, activeWidth = 30.dp)
        .setColor(getColor(R.color.teal_200), getColor(R.color.purple_200))
        .setGap(10.dp)
        .setCornerRadius(5.dp)
)
binding.banner1.setAdapter(BannerAdapter("WormMode")).start()
binding.banner1.setData(list)

binding.banner2.setIndicator(
    IndicatorView(this).setSlideMode()
        .setSize(10.dp)
        .setCornerRadius(2.dp)
        .setStroke(2.dp)
)
binding.banner2.setAdapter(BannerAdapter("SlideMode")).start()
binding.banner2.setData(list)

binding.banner3.setIndicator(
    IndicatorView(this).setWormMode().setRoundLine()
        .setSize(10.dp, activeWidth = 30.dp)
        .setCornerRadius(5.dp)
)
binding.banner3.setAdapter(BannerAdapter("RoundLine")).start()
binding.banner3.setData(list)

binding.banner4.setIndicator(
    ColorIndicatorView(this)
        .setColor(getColor(R.color.teal_200), getColor(R.color.purple_200))
        .setSize(20.dp)
        .setCornerRadius(5.dp)
)
binding.banner4.setAdapter(BannerAdapter("Color")).start()
binding.banner4.setData(list)

binding.banner5.setIndicator(ScaleIndicatorView(this).setSize(10.dp, activeWidth = 30.dp).setCornerRadius(2.dp))
binding.banner5.setAdapter(BannerAdapter("RectScale")).start()
binding.banner5.setData(list)

binding.banner6.setIndicator(ScaleIndicatorView(this).setOvalShape().setSize(10.dp, activeSize = 20.dp))
binding.banner6.setAdapter(BannerAdapter("OvalScale")).start()
binding.banner6.setData(list)
```

## Gradle

``` groovy
repositories {
    maven { url "https://gitee.com/ezy/repo/raw/cosmo/"}
}
dependencies {
    implementation "me.reezy.cosmo:indicatorview:0.10.0"
}
```

## LICENSE

The Component is open-sourced software licensed under the [Apache license](LICENSE).
