package com.home.androidmvparchitecturalpatterndemo.model

class MainModel {

    interface OnGetMainDataListener {
        fun onSuccess(mainData: MainBean)
    }

    fun getMainData(onGetMainDataListener: OnGetMainDataListener) {
        val mainData = MainBean(getPostList())
        onGetMainDataListener.onSuccess(mainData)
    }

    private fun getPostList(): ArrayList<MainBean.Post> {
        val postList = ArrayList<MainBean.Post>()
        var contentImageUrlList = ArrayList<MainBean.Post.ContentImageUrl>()
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://img.lovepik.com/photo/50077/6133.jpg_wh860.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://pic3.zhimg.com/v2-cc9c83b452a684896507a3dbb47ab49e_b.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://www.erv-nsa.gov.tw/content/images/page/top-attration-hualien-01.jpg"))
        postList.add(
            MainBean.Post(
                "https://m.shuaigetu.net/uploads/img1/20171104/244e2da07bd9ef49380e8b824f70d8d9.jpg",
                "小可愛",
                "任性賣萌團",
                "2 分鐘前",
                "女人迷寫字，寫下你相信、觸動內心深處的字句。你的初戀，是清新小品、長篇小說，還是一段未曾說出口的遺憾？無論這段故事怎麼進行，最讓人難忘的，或許還是當下那份能時時在心頭上掛念著一個人的純粹。女人迷寫字，寫下你相信、觸動內心深處的字句。",
                contentImageUrlList,
                "12"
            )
        )
        contentImageUrlList = ArrayList()
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://child.taiwan.net.tw/UserFiles/files/nsa_SunMoon.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://image.cdn-eztravel.com.tw/Qrp42o4vVUgj6okKwbYqI1pK-xNdwhvN-rnE1o9yPCk/g:ce/aHR0cHM6Ly93d3cuZXp0cmF2ZWwuY29tLnR3L2ltZy9WRFIvQ05fMTAwNTgwNDIzNS5qcGc.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://pic.pimg.tw/weilife/1508759490-2807984048.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://res.klook.com/image/upload/fl_lossy.progressive/q_auto/f_auto/blogtw/v2-38dac3d0a5dfae9ca51bda1e9212fe17_r.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://i-ogp.pximg.net/c/1050x550_80_a2_g2/img-master/img/2016/09/19/07/51/20/59058452_p0_master1200.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://www.taiwan.net.tw/att/1/big_scenic_spots/pic_412_8.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://wportfolio.wzu.edu.tw/blog/attach/23/55023/24/bf_94793_1303482_98970_3.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://4.share.photo.xuite.net/mr.coffee/14ffe81/5077281/216668000_x.jpg"))
        postList.add(
            MainBean.Post(
                "https://img2.ali213.net/picfile/News/2018/10/13/584_90892ed7f4d330c97195c7d4badf610c.jpg",
                "小豬豬",
                "吃吃喝喝團",
                "3 小時前",
                "相愛的本質是陪伴，是有一個人，用另一種目光溫柔看你，讓你卸下所有堅強的防備。其實你想要的，只不過是一個寬厚牽著你的手，去看病的人。其實你想要的，只不過是一個寬厚牽著你的手，去看病的人。",
                contentImageUrlList,
                "18"
            )
        )
        contentImageUrlList = ArrayList()
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://img.alicdn.com/imgextra/i3/735625932/TB2tNC8tLuSBuNkHFqDXXXfhVXa_!!735625932.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://images.haiwainet.cn/2016/0304/20160304035741333.png"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://teepr.com/wp-content/uploads/2014/03/cool-places5.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://teepr.com/wp-content/uploads/2014/03/cool-places20.jpg"))
        contentImageUrlList.add(MainBean.Post.ContentImageUrl("https://s9.rr.itc.cn/r/wapChange/20185_5_7/a2rxc98474225233552.jpeg"))
        postList.add(
            MainBean.Post(
                "https://pic.pimg.tw/nanamia38/abe774996fb7257bc5bdadb3cb0fbcb7.jpg",
                "小妞妞",
                "運動跑跑團",
                "2 天前",
                "你曾經在路上看到有人脖子上圍著毛巾，穿著輕便，滿身是汗的跑步或是在烈日下的籃球場上看到一群人正在激烈的「運動」？為什麼這麼多人都在運動？為什麼體育署提倡要運動333(每周進行有氧運動3天，每天30分鐘，每次運動心跳率至少達到130次/分)呢？因為科學家發現運動的好處和重要性，不能被其他生活事件取代，尤其是對大腦功能的保護作用。",
                contentImageUrlList,
                "30"
            )
        )
        return postList
    }
}