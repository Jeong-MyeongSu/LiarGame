package com.wjdaudtn.mini

import android.content.Context
import androidx.room.Room
import com.wjdaudtn.mini.Database.ActorData
import com.wjdaudtn.mini.Database.ActorDataDao
import com.wjdaudtn.mini.Database.AnimalData
import com.wjdaudtn.mini.Database.AnimalDataDao
import com.wjdaudtn.mini.Database.Database
import com.wjdaudtn.mini.Database.FB2Data
import com.wjdaudtn.mini.Database.FB2DataDao
import com.wjdaudtn.mini.Database.FBData
import com.wjdaudtn.mini.Database.FBDataDao
import com.wjdaudtn.mini.Database.FamousData
import com.wjdaudtn.mini.Database.FamousDataDao
import com.wjdaudtn.mini.Database.FreeData
import com.wjdaudtn.mini.Database.FreeDataDao
import com.wjdaudtn.mini.Database.ManagerData
import com.wjdaudtn.mini.Database.ManagerDataDao
import com.wjdaudtn.mini.Database.OldFBData
import com.wjdaudtn.mini.Database.OldFBDataDao
import com.wjdaudtn.mini.Database.PlaceData
import com.wjdaudtn.mini.Database.PlaceDataDao
import com.wjdaudtn.mini.Database.SingerData
import com.wjdaudtn.mini.Database.SingerDataDao
import com.wjdaudtn.mini.Database.SportsData
import com.wjdaudtn.mini.Database.SportsDataDao
import com.wjdaudtn.mini.Database.StuffData
import com.wjdaudtn.mini.Database.StuffDataDao

class init {
    companion object {
        var people = 3
        var checkNum = 0
        var count = 0

        lateinit var database: Database
        lateinit var mFBDataDao: FBDataDao
        lateinit var mFB2DataDao: FB2DataDao
        lateinit var mSingerDataDao: SingerDataDao
        lateinit var mStuffDataDao: StuffDataDao
        lateinit var mActorDataDao: ActorDataDao
        lateinit var mPlaceDataDao: PlaceDataDao
        lateinit var mAnimalDataDao: AnimalDataDao
        lateinit var mFamousDataDao: FamousDataDao
        lateinit var mOldDataDao: OldFBDataDao
        lateinit var mManagerDataDao: ManagerDataDao
        lateinit var mSportsDataDao: SportsDataDao
        lateinit var mFreeDataDao: FreeDataDao

        fun initializeDatabase(context: Context) {
            database = Room.databaseBuilder(
                context.applicationContext,
                Database::class.java,
                "Todo_db"
            ).fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build()

            mFBDataDao = database.fbDataDao()
            mFB2DataDao = database.fb2dataDao()
            mSingerDataDao = database.SingerDataDao()
            mStuffDataDao = database.stuffDataDao()
            mActorDataDao = database.actorDataDao()
            mPlaceDataDao = database.placeDataDao()
            mAnimalDataDao = database.animalDataDao()
            mFamousDataDao = database.famousDataDao()
            mOldDataDao = database.oldFbDataDao()
            mManagerDataDao = database.managerDataDao()
            mSportsDataDao = database.sportsDataDao()
            mFreeDataDao = database.freeDataDao()

            val fbPlayer1 = FBData().apply {
                id = 1
                word = "로멜루 루카쿠"
            }
            val fbPlayer2 = FBData().apply {
                id = 2
                word = "브루누 페르난데스"
            }
            val fbPlayer3 = FBData().apply {
                id = 3
                word = "킬리안 음바페"
            }
            val fbPlayer4 = FBData().apply {
                id = 4
                word = "소보슬러이"
            }
            val fbPlayer5 = FBData().apply {
                id = 5
                word = "크리스티아누 호날두"
            }
            val fbPlayer6 = FBData().apply {
                id = 6
                word = "헤리 케인"
            }
            val fbPlayer7 = FBData().apply {
                id = 7
                word = "주앙 칸셀루"
            }
            val fbPlayer8 = FBData().apply {
                id = 8
                word = "로드리"
            }
            val fbPlayer9 = FBData().apply {
                id = 9
                word = "스콧 맥토미니"
            }
            val fbplayer10 = FBData().apply {
                id = 10
                word = "앙투안 그리즈만"
            }
            val fbplayer11 = FBData().apply {
                id = 11
                word = "그라니트 자카"
            }
            val fbplayer12 = FBData().apply {
                id = 12
                word = "호이비에르"
            }
            val fbplayer13 = FBData().apply {
                id = 13
                word = "테오 에르난데스"
            }
            val fbplayer14 = FBData().apply {
                id = 14
                word = "후벵 디아스"
            }
            val fbplayer15 = FBData().apply {
                id = 15
                word = "추아메니"
            }
            val fbplayer16 = FBData().apply {
                id = 16
                word = "부카요 사카"
            }
            val fbplayer17 = FBData().apply {
                id = 17
                word = "크바라츠헬리아"
            }
            val fbplayer18 = FBData().apply {
                id = 18
                word = "루카 모드리치"
            }
            val fbplayer19 = FBData().apply {
                id = 19
                word = "제르단 샤키리"
            }
            val fbplayer20 = FBData().apply {
                id = 20
                word = "두샨 타디치"
            }
            val fbplayer21 = FBData().apply {
                id = 21
                word = "얀 오블라크"
            }
            val fbplayer22 = FBData().apply {
                id = 22
                word = "버질 반다이크"
            }
            val fbplayer23 = FBData().apply {
                id = 23
                word = "카르바할"
            }
            val fbplayer24 = FBData().apply {
                id = 24
                word = "하캍 찰하놀루"
            }
            val fbplayer25 = FBData().apply {
                id = 25
                word = "네이선 아케"
            }
            val fbplayer26 = FBData().apply {
                id = 26
                word = "마이크 메냥"
            }
            val fbplayer27 = FBData().apply {
                id = 27
                word = "미트로비치"
            }
            val fbplayer28 = FBData().apply {
                id = 28
                word = "베르나르두 실바"
            }
            val fbplayer29 = FBData().apply {
                id = 29
                word = "알렉산더 아놀드"
            }
            val fbplayer30 = FBData().apply {
                id = 30
                word = "덴젤 둠프리스"
            }
            val fbplayer31 = FBData().apply {
                id = 31
                word = "주드 벨링엄"
            }
            val fbplayer32 = FBData().apply {
                id = 32
                word = "호일룬"
            }
            val fbplayer33 = FBData().apply {
                id = 33
                word = "귄도안"
            }
            val fbplayer34 = FBData().apply {
                id = 34
                word = "레반도프스키"
            }
            val fbplayer35 = FBData().apply {
                id = 35
                word = "크리스티안 에릭센"
            }
            val fbplayer36 = FBData().apply {
                id = 36
                word = "데이비드 알라바"
            }
            val fbplayer37 = FBData().apply {
                id = 37
                word = "모라타"
            }
            val fbplayer38 = FBData().apply {
                id = 38
                word = "안토니오 뤼디거"
            }
            val fbplayer39 = FBData().apply {
                id = 39
                word = "에므리크 라포르트"
            }
            val fbplayer40 = FBData().apply {
                id = 40
                word = "마누엘 아칸지"
            }
            val fbplayer41 = FBData().apply {
                id = 41
                word = "다요 우파메카노"
            }
            val fbplayer42 = FBData().apply {
                id = 42
                word = "데클런 라이스"
            }
            val fbplayer43 = FBData().apply {
                id = 43
                word = "제레미 도쿠"
            }
            val fbplayer44 = FBData().apply {
                id = 44
                word = "이반 페리시치"
            }
            val fbplayer45 = FBData().apply {
                id = 45
                word = "카일 워커"
            }
            val fbplayer46 = FBData().apply {
                id = 46
                word = "해리 매과이어"
            }
            val fbplayer47 = FBData().apply {
                id = 47
                word = "킹슬레 코망"
            }
            val fbplayer48 = FBData().apply {
                id = 48
                word = "앤드루 로버트슨"
            }
            val fbplayer49 = FBData().apply {
                id = 49
                word = "리로이 사네"
            }
            val fbplayer50 = FBData().apply {
                id = 50
                word = "돈나룸마"
            }
            val fbplayer51 = FBData().apply {
                id = 51
                word = "페란 토레스"
            }
            val fbplayer52 = FBData().apply {
                id = 52
                word = "주앙 펠릭스"
            }
            val fbplayer53 = FBData().apply {
                id = 53
                word = "그바르디올"
            }
            val fbplayer54 = FBData().apply {
                id = 54
                word = "플로리안 비르츠"
            }
            val fbplayer55 = FBData().apply {
                id = 55
                word = "얀 베르통언"
            }
            val fbplayer56 = FBData().apply {
                id = 56
                word = "호셀루"
            }
            val fbplayer57 = FBData().apply {
                id = 57
                word = "조던 픽포드"
            }
            val fbplayer58 = FBData().apply {
                id = 58
                word = "니클라스 퓔크루크"
            }
            val fbplayer59 = FBData().apply {
                id = 59
                word = "디오구 달로"
            }
            val fbplayer60 = FBData().apply {
                id = 60
                word = "필 포든"
            }
            val fbplayer61 = FBData().apply {
                id = 61
                word = "하파엘 레앙"
            }
            val fbplayer62 = FBData().apply {
                id = 62
                word = "코디 각포"
            }
            val fbplayer63 = FBData().apply {
                id = 63
                word = "무드리크"
            }
            val fbplayer64 = FBData().apply {
                id = 64
                word = "카퍼스 슈마이켈"
            }
            val fbplayer65 = FBData().apply {
                id = 65
                word = "올리비에 지루"
            }
            val fbplayer66 = FBData().apply {
                id = 66
                word = "조던 헨더슨"
            }
            val fbplayer67 = FBData().apply {
                id = 67
                word = "키어런 트리피어"
            }
            val fbplayer68 = FBData().apply {
                id = 68
                word = "테어슈테겐"
            }
            val fbplayer69 = FBData().apply {
                id = 69
                word = "존 스톤스"
            }
            val fbplayer70 = FBData().apply {
                id = 70
                word = "루크 쇼"
            }
            val fbplayer71 = FBData().apply {
                id = 71
                word = "니클라스 쥘레"
            }
            val fbplayer72 = FBData().apply {
                id = 72
                word = "제임스 매디슨"
            }
            val fbplayer73 = FBData().apply {
                id = 73
                word = "마커스 레시포드"
            }
            val fbplayer74 = FBData().apply {
                id = 74
                word = "카이 하베르츠"
            }
            val fbplayer75 = FBData().apply {
                id = 75
                word = "앤서니 고든"
            }

            if(mFBDataDao.getDataAll().isEmpty()){
                mFBDataDao.setInsertData(fbPlayer1)
                mFBDataDao.setInsertData(fbPlayer2)
                mFBDataDao.setInsertData(fbPlayer3)
                mFBDataDao.setInsertData(fbPlayer4)
                mFBDataDao.setInsertData(fbPlayer5)
                mFBDataDao.setInsertData(fbPlayer6)
                mFBDataDao.setInsertData(fbPlayer7)
                mFBDataDao.setInsertData(fbPlayer8)
                mFBDataDao.setInsertData(fbPlayer9)
                mFBDataDao.setInsertData(fbplayer10)
                mFBDataDao.setInsertData(fbplayer11)
                mFBDataDao.setInsertData(fbplayer12)
                mFBDataDao.setInsertData(fbplayer13)
                mFBDataDao.setInsertData(fbplayer14)
                mFBDataDao.setInsertData(fbplayer15)
                mFBDataDao.setInsertData(fbplayer16)
                mFBDataDao.setInsertData(fbplayer17)
                mFBDataDao.setInsertData(fbplayer18)
                mFBDataDao.setInsertData(fbplayer19)
                mFBDataDao.setInsertData(fbplayer20)
                mFBDataDao.setInsertData(fbplayer21)
                mFBDataDao.setInsertData(fbplayer22)
                mFBDataDao.setInsertData(fbplayer23)
                mFBDataDao.setInsertData(fbplayer24)
                mFBDataDao.setInsertData(fbplayer25)
                mFBDataDao.setInsertData(fbplayer26)
                mFBDataDao.setInsertData(fbplayer27)
                mFBDataDao.setInsertData(fbplayer28)
                mFBDataDao.setInsertData(fbplayer29)
                mFBDataDao.setInsertData(fbplayer30)
                mFBDataDao.setInsertData(fbplayer31)
                mFBDataDao.setInsertData(fbplayer32)
                mFBDataDao.setInsertData(fbplayer33)
                mFBDataDao.setInsertData(fbplayer34)
                mFBDataDao.setInsertData(fbplayer35)
                mFBDataDao.setInsertData(fbplayer36)
                mFBDataDao.setInsertData(fbplayer37)
                mFBDataDao.setInsertData(fbplayer38)
                mFBDataDao.setInsertData(fbplayer39)
                mFBDataDao.setInsertData(fbplayer40)
                mFBDataDao.setInsertData(fbplayer41)
                mFBDataDao.setInsertData(fbplayer42)
                mFBDataDao.setInsertData(fbplayer43)
                mFBDataDao.setInsertData(fbplayer44)
                mFBDataDao.setInsertData(fbplayer45)
                mFBDataDao.setInsertData(fbplayer46)
                mFBDataDao.setInsertData(fbplayer47)
                mFBDataDao.setInsertData(fbplayer48)
                mFBDataDao.setInsertData(fbplayer49)
                mFBDataDao.setInsertData(fbplayer50)
                mFBDataDao.setInsertData(fbplayer51)
                mFBDataDao.setInsertData(fbplayer52)
                mFBDataDao.setInsertData(fbplayer53)
                mFBDataDao.setInsertData(fbplayer54)
                mFBDataDao.setInsertData(fbplayer55)
                mFBDataDao.setInsertData(fbplayer56)
                mFBDataDao.setInsertData(fbplayer57)
                mFBDataDao.setInsertData(fbplayer58)
                mFBDataDao.setInsertData(fbplayer59)
                mFBDataDao.setInsertData(fbplayer60)
                mFBDataDao.setInsertData(fbplayer61)
                mFBDataDao.setInsertData(fbplayer62)
                mFBDataDao.setInsertData(fbplayer63)
                mFBDataDao.setInsertData(fbplayer64)
                mFBDataDao.setInsertData(fbplayer65)
                mFBDataDao.setInsertData(fbplayer66)
                mFBDataDao.setInsertData(fbplayer67)
                mFBDataDao.setInsertData(fbplayer68)
                mFBDataDao.setInsertData(fbplayer69)
                mFBDataDao.setInsertData(fbplayer70)
                mFBDataDao.setInsertData(fbplayer71)
                mFBDataDao.setInsertData(fbplayer72)
                mFBDataDao.setInsertData(fbplayer73)
                mFBDataDao.setInsertData(fbplayer74)
                mFBDataDao.setInsertData(fbplayer75)
            }

            val fb2player1 = FB2Data().apply {
                id = 1
                word = "리오넬 메시"
            }
            val fb2player2 = FB2Data().apply {
                id = 2
                word = "디 마리아"
            }
            val fb2player3 = FB2Data().apply {
                id = 3
                word = "훌리안 알바레즈"
            }
            val fb2player4 = FB2Data().apply {
                id = 4
                word = "맥 알리스터"
            }
            val fb2player5 = FB2Data().apply {
                id = 5
                word = "크리스티안 로메로"
            }
            val fb2player6 = FB2Data().apply {
                id = 6
                word = "리산드로 마르티네즈"
            }
            val fb2player7 = FB2Data().apply {
                id = 7
                word = "에밀리아노 마르티네즈"
            }
            val fb2player8 = FB2Data().apply {
                id = 8
                word = "알폰소 데이비스"
            }
            val fb2player9 = FB2Data().apply {
                id = 9
                word = "지오반니 로셀소"
            }
            val fb2player10 = FB2Data().apply {
                id = 10
                word = "알레한드로 가르나초"
            }
            val fb2player11 = FB2Data().apply {
                id = 11
                word = "엔소 페르난데스"
            }
            val fb2player12 = FB2Data().apply {
                id = 12
                word = "알렉시스 산체스"
            }
            val fb2player13 = FB2Data().apply {
                id = 13
                word = "클라우디오 브라보"
            }
            val fb2player14 = FB2Data().apply {
                id = 14
                word = "모이세스 카세이도"
            }
            val fb2player15 = FB2Data().apply {
                id = 15
                word = "크리스티안 풀리식"
            }
            val fb2player16 = FB2Data().apply {
                id = 16
                word = "마누엘 우가르테"
            }
            val fb2player17 = FB2Data().apply {
                id = 17
                word = "로날두 아라우호"
            }
            val fb2player18 = FB2Data().apply {
                id = 18
                word = "페데리코 발베르데"
            }
            val fb2player19 = FB2Data().apply {
                id = 19
                word = "로드리고 벤탄쿠르"
            }
            val fb2player20 = FB2Data().apply {
                id = 20
                word = "루이스 수아레스"
            }
            val fb2player21 = FB2Data().apply {
                id = 21
                word = "루이스 디아즈"
            }
            val fb2player22 = FB2Data().apply {
                id = 22
                word = "미겔 알미론"
            }
            val fb2player23 = FB2Data().apply {
                id = 23
                word = "호드리구"
            }
            val fb2player24 = FB2Data().apply {
                id = 24
                word = "루카스 파케타"
            }
            val fb2player25 = FB2Data().apply {
                id = 25
                word = "비니시우스 주니어"
            }
            val fb2player26 = FB2Data().apply {
                id = 26
                word = "하피냐"
            }
            val fb2player27 = FB2Data().apply {
                id = 27
                word = "브르노 기마랑이스"
            }
            val fb2player28 = FB2Data().apply {
                id = 28
                word = "다닐로"
            }
            val fb2player29 = FB2Data().apply {
                id = 29
                word = "알리송 베케르"
            }
            val fb2player30 = FB2Data().apply {
                id = 30
                word = "엔드릭"
            }
            val fb2player31 = FB2Data().apply {
                id = 31
                word = "마르키뉴스"
            }
            val fb2player32 = FB2Data().apply {
                id = 32
                word = "에데르 밀리탕"
            }
            val fb2player33 = FB2Data().apply {
                id = 33
                word = "가브리엘 마르티넬리"
            }
            val fb2player34 = FB2Data().apply {
                id = 34
                word = "하메스 로드리게스"
            }

            if(mFB2DataDao.getDataAll().isEmpty()) {
                mFB2DataDao.setInsertData(fb2player1)
                mFB2DataDao.setInsertData(fb2player2)
                mFB2DataDao.setInsertData(fb2player3)
                mFB2DataDao.setInsertData(fb2player4)
                mFB2DataDao.setInsertData(fb2player5)
                mFB2DataDao.setInsertData(fb2player6)
                mFB2DataDao.setInsertData(fb2player7)
                mFB2DataDao.setInsertData(fb2player8)
                mFB2DataDao.setInsertData(fb2player9)
                mFB2DataDao.setInsertData(fb2player10)
                mFB2DataDao.setInsertData(fb2player11)
                mFB2DataDao.setInsertData(fb2player12)
                mFB2DataDao.setInsertData(fb2player13)
                mFB2DataDao.setInsertData(fb2player14)
                mFB2DataDao.setInsertData(fb2player15)
                mFB2DataDao.setInsertData(fb2player16)
                mFB2DataDao.setInsertData(fb2player17)
                mFB2DataDao.setInsertData(fb2player18)
                mFB2DataDao.setInsertData(fb2player19)
                mFB2DataDao.setInsertData(fb2player20)
                mFB2DataDao.setInsertData(fb2player21)
                mFB2DataDao.setInsertData(fb2player22)
                mFB2DataDao.setInsertData(fb2player23)
                mFB2DataDao.setInsertData(fb2player24)
                mFB2DataDao.setInsertData(fb2player25)
                mFB2DataDao.setInsertData(fb2player26)
                mFB2DataDao.setInsertData(fb2player27)
                mFB2DataDao.setInsertData(fb2player28)
                mFB2DataDao.setInsertData(fb2player29)
                mFB2DataDao.setInsertData(fb2player30)
                mFB2DataDao.setInsertData(fb2player31)
                mFB2DataDao.setInsertData(fb2player32)
                mFB2DataDao.setInsertData(fb2player33)
                mFB2DataDao.setInsertData(fb2player34)
            }

            val singer1 = SingerData().apply {
                word = "에스파"
            }
            val singer2 = SingerData().apply {
                word = "뉴진스"
            }
            val singer3 = SingerData().apply {
                word = "하이키"
            }
            val singer4 = SingerData().apply {
                word = "QWER"
            }
            val singer5 = SingerData().apply {
                word = "어반자카파"
            }
            val singer6 = SingerData().apply {
                word = "지코"
            }
            val singer7 = SingerData().apply {
                word = "아이브"
            }
            val singer8 = SingerData().apply {
                word = "아일릿"
            }
            val singer9 = SingerData().apply {
                word = "크러시"
            }
            val singer10 = SingerData().apply {
                word = "백지영"
            }
            val singer11 = SingerData().apply {
                word = "비비"
            }
            val singer12 = SingerData().apply {
                word = "선미"
            }
            val singer13 = SingerData().apply {
                word = "이무진"
            }
            val singer14 = SingerData().apply {
                word = "세븐틴"
            }
            val singer15 = SingerData().apply {
                word = "아이유"
            }
            val singer16 = SingerData().apply {
                word = "태연"
            }
            val singer17 = SingerData().apply {
                word = "보이비"
            }
            val singer18 = SingerData().apply {
                word = "노라조"
            }
            val singer19 = SingerData().apply {
                word = "윤하"
            }
            val singer20 = SingerData().apply {
                word = "르세라핌"
            }
            val singer21 = SingerData().apply {
                word = "PH-1"
            }
            val singer22 = SingerData().apply {
                word = "(여자)아이들"
            }
            val singer23 = SingerData().apply {
                word = "EXO"
            }
            val singer24 = SingerData().apply {
                word = "성시경"
            }
            val singer25 = SingerData().apply {
                word = "박효신"
            }
            val singer26 = SingerData().apply {
                word = "블랙핑크"
            }
            val singer27 = SingerData().apply {
                word = "임영웅"
            }
            val singer28 = SingerData().apply {
                word = "10CM"
            }
            val singer29 = SingerData().apply {
                word = "강민경"
            }
            val singer30 = SingerData().apply {
                word = "호미들"
            }
            val singer31 = SingerData().apply {
                word = "볼빨간 사춘기"
            }
            val singer32 = SingerData().apply {
                word = "방탄소년단"
            }
            val singer33 = SingerData().apply {
                word = "트와이스"
            }
            val singer34 = SingerData().apply {
                word = "장범준"
            }
            val singer35 = SingerData().apply {
                word = "백예린"
            }
            val singer36 = SingerData().apply {
                word = "박봄"
            }
            val singer37 = SingerData().apply {
                word = "에픽하이"
            }
            val singer38 = SingerData().apply {
                word = "마마무"
            }
            val singer39 = SingerData().apply {
                word = "엠시더맥스"
            }
            val singer40 = SingerData().apply {
                word = "청하"
            }
            val singer41 = SingerData().apply {
                word = "벤"
            }
            val singer42 = SingerData().apply {
                word = "이소라"
            }
            val singer43 = SingerData().apply {
                word = "재키와이"
            }
            val singer44 = SingerData().apply {
                word = "지드래곤"
            }
            val singer45 = SingerData().apply {
                word = "씨스타"
            }
            val singer46 = SingerData().apply {
                word = "한동근"
            }
            val singer47 = SingerData().apply {
                word = "백아연"
            }
            val singer48 = SingerData().apply {
                word = "임창정"
            }
            val singer49 = SingerData().apply {
                word = "여자친구"
            }
            val singer50 = SingerData().apply {
                word = "로꼬"
            }
            val singer51 = SingerData().apply {
                word = "자이언티"
            }
            val singer52 = SingerData().apply {
                word = "미쓰에이"
            }
            val singer53 = SingerData().apply {
                word = "에이핑크"
            }
            val singer54 = SingerData().apply {
                word = "송민호"
            }
            val singer55 = SingerData().apply {
                word = "태양"
            }
            val singer56 = SingerData().apply {
                word = "블랙넛"
            }
            val singer57 = SingerData().apply {
                word = "타이거JK"
            }
            val singer58 = SingerData().apply {
                word = "빈지노"
            }
            val singer59 = SingerData().apply {
                word = "오혁"
            }
            val singer60 = SingerData().apply {
                word = "개리"
            }
            val singer61 = SingerData().apply {
                word = "산이"
            }
            val singer62 = SingerData().apply {
                word = "스윙스"
            }
            val singer63 = SingerData().apply {
                word = "MC몽"
            }
            val singer64 = SingerData().apply {
                word = "포미닛"
            }
            val singer65 = SingerData().apply {
                word = "박재범"
            }
            val singer66 = SingerData().apply {
                word = "악동뮤지션"
            }
            val singer67 = SingerData().apply {
                word = "이하이"
            }
            val singer68 = SingerData().apply {
                word = "거미"
            }
            val singer69 = SingerData().apply {
                word = "다이나믹 듀오"
            }

            if(mSingerDataDao.getDataAll().isEmpty()) {
                mSingerDataDao.setInsertData(singer1)
                mSingerDataDao.setInsertData(singer2)
                mSingerDataDao.setInsertData(singer3)
                mSingerDataDao.setInsertData(singer4)
                mSingerDataDao.setInsertData(singer5)
                mSingerDataDao.setInsertData(singer6)
                mSingerDataDao.setInsertData(singer7)
                mSingerDataDao.setInsertData(singer8)
                mSingerDataDao.setInsertData(singer9)
                mSingerDataDao.setInsertData(singer10)
                mSingerDataDao.setInsertData(singer11)
                mSingerDataDao.setInsertData(singer12)
                mSingerDataDao.setInsertData(singer13)
                mSingerDataDao.setInsertData(singer14)
                mSingerDataDao.setInsertData(singer15)
                mSingerDataDao.setInsertData(singer16)
                mSingerDataDao.setInsertData(singer17)
                mSingerDataDao.setInsertData(singer18)
                mSingerDataDao.setInsertData(singer19)
                mSingerDataDao.setInsertData(singer20)
                mSingerDataDao.setInsertData(singer21)
                mSingerDataDao.setInsertData(singer22)
                mSingerDataDao.setInsertData(singer23)
                mSingerDataDao.setInsertData(singer24)
                mSingerDataDao.setInsertData(singer25)
                mSingerDataDao.setInsertData(singer26)
                mSingerDataDao.setInsertData(singer27)
                mSingerDataDao.setInsertData(singer28)
                mSingerDataDao.setInsertData(singer29)
                mSingerDataDao.setInsertData(singer30)
                mSingerDataDao.setInsertData(singer31)
                mSingerDataDao.setInsertData(singer32)
                mSingerDataDao.setInsertData(singer33)
                mSingerDataDao.setInsertData(singer34)
                mSingerDataDao.setInsertData(singer35)
                mSingerDataDao.setInsertData(singer36)
                mSingerDataDao.setInsertData(singer37)
                mSingerDataDao.setInsertData(singer38)
                mSingerDataDao.setInsertData(singer39)
                mSingerDataDao.setInsertData(singer40)
                mSingerDataDao.setInsertData(singer41)
                mSingerDataDao.setInsertData(singer42)
                mSingerDataDao.setInsertData(singer43)
                mSingerDataDao.setInsertData(singer44)
                mSingerDataDao.setInsertData(singer45)
                mSingerDataDao.setInsertData(singer46)
                mSingerDataDao.setInsertData(singer47)
                mSingerDataDao.setInsertData(singer48)
                mSingerDataDao.setInsertData(singer49)
                mSingerDataDao.setInsertData(singer50)
                mSingerDataDao.setInsertData(singer51)
                mSingerDataDao.setInsertData(singer52)
                mSingerDataDao.setInsertData(singer53)
                mSingerDataDao.setInsertData(singer54)
                mSingerDataDao.setInsertData(singer55)
                mSingerDataDao.setInsertData(singer56)
                mSingerDataDao.setInsertData(singer57)
                mSingerDataDao.setInsertData(singer58)
                mSingerDataDao.setInsertData(singer59)
                mSingerDataDao.setInsertData(singer60)
                mSingerDataDao.setInsertData(singer61)
                mSingerDataDao.setInsertData(singer62)
                mSingerDataDao.setInsertData(singer63)
                mSingerDataDao.setInsertData(singer64)
                mSingerDataDao.setInsertData(singer65)
                mSingerDataDao.setInsertData(singer66)
                mSingerDataDao.setInsertData(singer67)
                mSingerDataDao.setInsertData(singer68)
                mSingerDataDao.setInsertData(singer69)
            }
            val stuff1 = StuffData().apply {
                word = "의자"
            }
            val stuff2 = StuffData().apply {
                word = "책상"
            }
            val stuff3 = StuffData().apply {
                word = "컴퓨터"
            }
            val stuff4 = StuffData().apply {
                word = "키보드"
            }
            val stuff5 = StuffData().apply {
                word = "마우스"
            }
            val stuff6 = StuffData().apply {
                word = "모니터"
            }
            val stuff7 = StuffData().apply {
                word = "프린터"
            }
            val stuff8 = StuffData().apply {
                word = "노트북"
            }
            val stuff9 = StuffData().apply {
                word = "연필"
            }
            val stuff10 = StuffData().apply {
                word = "공책"
            }
            val stuff11 = StuffData().apply {
                word = "책"
            }
            val stuff12 = StuffData().apply {
                word = "전화기"
            }
            val stuff13 = StuffData().apply {
                word = "가방"
            }
            val stuff14 = StuffData().apply {
                word = "컵"
            }
            val stuff15 = StuffData().apply {
                word = "물병"
            }
            val stuff16 = StuffData().apply {
                word = "시계"
            }
            val stuff17 = StuffData().apply {
                word = "달력"
            }
            val stuff18 = StuffData().apply {
                word = "라디오"
            }
            val stuff19 = StuffData().apply {
                word = "리모컨"
            }
            val stuff20 = StuffData().apply {
                word = "스피커"
            }
            val stuff21 = StuffData().apply {
                word = "헤드폰"
            }
            val stuff22 = StuffData().apply {
                word = "모자"
            }
            val stuff23 = StuffData().apply {
                word = "안경"
            }
            val stuff24 = StuffData().apply {
                word = "우산"
            }
            val stuff25 = StuffData().apply {
                word = "장갑"
            }
            val stuff26 = StuffData().apply {
                word = "양말"
            }
            val stuff27 = StuffData().apply {
                word = "신발"
            }
            val stuff28 = StuffData().apply {
                word = "소파"
            }
            val stuff29 = StuffData().apply {
                word = "침대"
            }
            val stuff30 = StuffData().apply {
                word = "베개"
            }
            val stuff31 = StuffData().apply {
                word = "이불"
            }
            val stuff32 = StuffData().apply {
                word = "커튼"
            }
            val stuff33 = StuffData().apply {
                word = "전구"
            }
            val stuff34 = StuffData().apply {
                word = "쓰레기통"
            }
            val stuff35 = StuffData().apply {
                word = "빗자루"
            }
            val stuff36 = StuffData().apply {
                word = "청소기"
            }
            val stuff37 = StuffData().apply {
                word = "다리미"
            }
            val stuff38 = StuffData().apply {
                word = "세탁기"
            }
            val stuff39 = StuffData().apply {
                word = "냉장고"
            }
            val stuff40 = StuffData().apply {
                word = "전자레인지"
            }
            val stuff41 = StuffData().apply {
                word = "믹서기"
            }
            val stuff42 = StuffData().apply {
                word = "냄비"
            }
            val stuff43 = StuffData().apply {
                word = "프라이팬"
            }
            val stuff44 = StuffData().apply {
                word = "칼"
            }
            val stuff45 = StuffData().apply {
                word = "숟가락"
            }
            val stuff46 = StuffData().apply {
                word = "포크"
            }
            val stuff47 = StuffData().apply {
                word = "젓가락"
            }
            val stuff48 = StuffData().apply {
                word = "접시"
            }
            val stuff49 = StuffData().apply {
                word = "그릇"
            }
            val stuff50 = StuffData().apply {
                word = "식탁"
            }
            val stuff51 = StuffData().apply {
                word = "의자"
            }
            val stuff52 = StuffData().apply {
                word = "병따개"
            }
            val stuff53 = StuffData().apply {
                word = "와인잔"
            }
            val stuff54 = StuffData().apply {
                word = "맥주잔"
            }
            val stuff55 = StuffData().apply {
                word = "휴지통"
            }
            val stuff56 = StuffData().apply {
                word = "샤워기"
            }
            val stuff57 = StuffData().apply {
                word = "비누"
            }
            val stuff58 = StuffData().apply {
                word = "치약"
            }
            val stuff59 = StuffData().apply {
                word = "칫솔"
            }
            val stuff60 = StuffData().apply {
                word = "샴푸"
            }
            val stuff61 = StuffData().apply {
                word = "수건"
            }
            val stuff62 = StuffData().apply {
                word = "헤어드라이어"
            }
            val stuff63 = StuffData().apply {
                word = "손톱깎이"
            }
            val stuff64 = StuffData().apply {
                word = "거울"
            }
            val stuff65 = StuffData().apply {
                word = "화장품"
            }
            val stuff66 = StuffData().apply {
                word = "면도기"
            }

            if(mStuffDataDao.getDataAll().isEmpty()) {
                mStuffDataDao.setInsertData(stuff1)
                mStuffDataDao.setInsertData(stuff2)
                mStuffDataDao.setInsertData(stuff3)
                mStuffDataDao.setInsertData(stuff4)
                mStuffDataDao.setInsertData(stuff5)
                mStuffDataDao.setInsertData(stuff6)
                mStuffDataDao.setInsertData(stuff7)
                mStuffDataDao.setInsertData(stuff8)
                mStuffDataDao.setInsertData(stuff9)
                mStuffDataDao.setInsertData(stuff10)
                mStuffDataDao.setInsertData(stuff11)
                mStuffDataDao.setInsertData(stuff12)
                mStuffDataDao.setInsertData(stuff13)
                mStuffDataDao.setInsertData(stuff14)
                mStuffDataDao.setInsertData(stuff15)
                mStuffDataDao.setInsertData(stuff16)
                mStuffDataDao.setInsertData(stuff17)
                mStuffDataDao.setInsertData(stuff18)
                mStuffDataDao.setInsertData(stuff19)
                mStuffDataDao.setInsertData(stuff20)
                mStuffDataDao.setInsertData(stuff21)
                mStuffDataDao.setInsertData(stuff22)
                mStuffDataDao.setInsertData(stuff23)
                mStuffDataDao.setInsertData(stuff24)
                mStuffDataDao.setInsertData(stuff25)
                mStuffDataDao.setInsertData(stuff26)
                mStuffDataDao.setInsertData(stuff27)
                mStuffDataDao.setInsertData(stuff28)
                mStuffDataDao.setInsertData(stuff29)
                mStuffDataDao.setInsertData(stuff30)
                mStuffDataDao.setInsertData(stuff31)
                mStuffDataDao.setInsertData(stuff32)
                mStuffDataDao.setInsertData(stuff33)
                mStuffDataDao.setInsertData(stuff34)
                mStuffDataDao.setInsertData(stuff35)
                mStuffDataDao.setInsertData(stuff36)
                mStuffDataDao.setInsertData(stuff37)
                mStuffDataDao.setInsertData(stuff38)
                mStuffDataDao.setInsertData(stuff39)
                mStuffDataDao.setInsertData(stuff40)
                mStuffDataDao.setInsertData(stuff41)
                mStuffDataDao.setInsertData(stuff42)
                mStuffDataDao.setInsertData(stuff43)
                mStuffDataDao.setInsertData(stuff44)
                mStuffDataDao.setInsertData(stuff45)
                mStuffDataDao.setInsertData(stuff46)
                mStuffDataDao.setInsertData(stuff47)
                mStuffDataDao.setInsertData(stuff48)
                mStuffDataDao.setInsertData(stuff49)
                mStuffDataDao.setInsertData(stuff50)
                mStuffDataDao.setInsertData(stuff51)
                mStuffDataDao.setInsertData(stuff52)
                mStuffDataDao.setInsertData(stuff53)
                mStuffDataDao.setInsertData(stuff54)
                mStuffDataDao.setInsertData(stuff55)
                mStuffDataDao.setInsertData(stuff56)
                mStuffDataDao.setInsertData(stuff57)
                mStuffDataDao.setInsertData(stuff58)
                mStuffDataDao.setInsertData(stuff59)
                mStuffDataDao.setInsertData(stuff60)
                mStuffDataDao.setInsertData(stuff61)
                mStuffDataDao.setInsertData(stuff62)
                mStuffDataDao.setInsertData(stuff63)
                mStuffDataDao.setInsertData(stuff64)
                mStuffDataDao.setInsertData(stuff65)
                mStuffDataDao.setInsertData(stuff66)
            }

            val actor1 = ActorData().apply {
                word = "마동석"
            }
            val actor2 = ActorData().apply {
                word = "손석구"
            }
            val actor3 = ActorData().apply {
                word = "송강호"
            }
            val actor4 = ActorData().apply {
                word = "이병헌"
            }
            val actor5 = ActorData().apply {
                word = "하정우"
            }
            val actor6 = ActorData().apply {
                word = "조정석"
            }
            val actor7 = ActorData().apply {
                word = "유아인"
            }
            val actor8 = ActorData().apply {
                word = "박서준"
            }
            val actor9 = ActorData().apply {
                word = "김수현"
            }
            val actor10 = ActorData().apply {
                word = "공유"
            }
            val actor11 = ActorData().apply {
                word = "현빈"
            }
            val actor12 = ActorData().apply {
                word = "이정재"
            }
            val actor13 = ActorData().apply {
                word = "주지훈"
            }
            val actor14 = ActorData().apply {
                word = "류승룡"
            }
            val actor15 = ActorData().apply {
                word = "황정민"
            }
            val actor16 = ActorData().apply {
                word = "정우성"
            }
            val actor17 = ActorData().apply {
                word = "조인성"
            }
            val actor18 = ActorData().apply {
                word = "김남길"
            }
            val actor19 = ActorData().apply {
                word = "김우빈"
            }
            val actor20 = ActorData().apply {
                word = "차승원"
            }
            val actor21 = ActorData().apply {
                word = "송중기"
            }
            val actor22 = ActorData().apply {
                word = "박보검"
            }
            val actor23 = ActorData().apply {
                word = "장동건"
            }
            val actor24 = ActorData().apply {
                word = "소지섭"
            }
            val actor25 = ActorData().apply {
                word = "정해인"
            }
            val actor26 = ActorData().apply {
                word = "유해진"
            }
            val actor27 = ActorData().apply {
                word = "강동원"
            }
            val actor28 = ActorData().apply {
                word = "이제훈"
            }
            val actor29 = ActorData().apply {
                word = "김상중"
            }
            val actor30 = ActorData().apply {
                word = "신하균"
            }
            val actor31 = ActorData().apply {
                word = "김래원"
            }
            val actor32 = ActorData().apply {
                word = "이선균"
            }
            val actor33 = ActorData().apply {
                word = "김희원"
            }
            val actor34 = ActorData().apply {
                word = "조승우"
            }
            val actor35 = ActorData().apply {
                word = "이종석"
            }
            val actor36 = ActorData().apply {
                word = "변요한"
            }
            val actor37 = ActorData().apply {
                word = "최민식"
            }
            val actor38 = ActorData().apply {
                word = "설경구"
            }
            val actor39 = ActorData().apply {
                word = "박정민"
            }
            val actor40 = ActorData().apply {
                word = "이광수"
            }
            val actor41 = ActorData().apply {
                word = "류준열"
            }
            val actor42 = ActorData().apply {
                word = "진구"
            }
            val actor43 = ActorData().apply {
                word = "이동휘"
            }
            val actor44 = ActorData().apply {
                word = "김성균"
            }
            val actor45 = ActorData().apply {
                word = "김윤석"
            }
            val actor46 = ActorData().apply {
                word = "임시완"
            }
            val actor47 = ActorData().apply {
                word = "남주혁"
            }
            val actor48 = ActorData().apply {
                word = "이민호"
            }
            val actor49 = ActorData().apply {
                word = "김수로"
            }
            val actor50 = ActorData().apply {
                word = "장혁"
            }
            val actor51 = ActorData().apply {
                word = "정준호"
            }
            val actor52 = ActorData().apply {
                word = "이범수"
            }
            val actor53 = ActorData().apply {
                word = "박신양"
            }
            val actor54 = ActorData().apply {
                word = "수지"
            }
            val actor55 = ActorData().apply {
                word = "한효주"
            }
            val actor56 = ActorData().apply {
                word = "배두나"
            }
            val actor57 = ActorData().apply {
                word = "손예진"
            }
            val actor58 = ActorData().apply {
                word = "박소담"
            }
            val actor59 = ActorData().apply {
                word = "박보영"
            }
            val actor60 = ActorData().apply {
                word = "김태리"
            }
            val actor61 = ActorData().apply {
                word = "전지현"
            }
            val actor62 = ActorData().apply {
                word = "정소민"
            }
            val actor63 = ActorData().apply {
                word = "윤여정"
            }
            val actor64 = ActorData().apply {
                word = "김혜수"
            }
            val actor65 = ActorData().apply {
                word = "문소리"
            }
            val actor66 = ActorData().apply {
                word = "이영애"
            }
            val actor67 = ActorData().apply {
                word = "최수종"
            }
            val actor68 = ActorData().apply {
                word = "신민아"
            }
            val actor69 = ActorData().apply {
                word = "고수"
            }
            val actor70 = ActorData().apply {
                word = "류승범"
            }
            val actor71 = ActorData().apply {
                word = "차태현"
            }
            val actor72 = ActorData().apply {
                word = "이진욱"
            }
            val actor73 = ActorData().apply {
                word = "김유정"
            }
            val actor74 = ActorData().apply {
                word = "이진욱"
            }
            val actor75 = ActorData().apply {
                word = "고경표"
            }
            val actor76 = ActorData().apply {
                word = "강하늘"
            }
            val actor77 = ActorData().apply {
                word = "김동완"
            }
            val actor78 = ActorData().apply {
                word = "김지석"
            }
            val actor79 = ActorData().apply {
                word = "도경수"
            }
            val actor80 = ActorData().apply {
                word = "윤계상"
            }
            val actor81 = ActorData().apply {
                word = "이동욱"
            }
            val actor82 = ActorData().apply {
                word = "정일우"
            }
            val actor83 = ActorData().apply {
                word = "이수혁"
            }
            val actor84 = ActorData().apply {
                word = "지창욱"
            }
            val actor85 = ActorData().apply {
                word = "박민영"
            }
            val actor86 = ActorData().apply {
                word = "박하선"
            }
            val actor87 = ActorData().apply {
                word = "서강준"
            }
            val actor88 = ActorData().apply {
                word = "최다니엘"
            }
            val actor89 = ActorData().apply {
                word = "남궁민"
            }
            val actor90 = ActorData().apply {
                word = "김영광"
            }

            if(mActorDataDao.getDataAll().isEmpty()) {
                mActorDataDao.setInsertData(actor1)
                mActorDataDao.setInsertData(actor2)
                mActorDataDao.setInsertData(actor3)
                mActorDataDao.setInsertData(actor4)
                mActorDataDao.setInsertData(actor5)
                mActorDataDao.setInsertData(actor6)
                mActorDataDao.setInsertData(actor7)
                mActorDataDao.setInsertData(actor8)
                mActorDataDao.setInsertData(actor9)
                mActorDataDao.setInsertData(actor10)
                mActorDataDao.setInsertData(actor11)
                mActorDataDao.setInsertData(actor12)
                mActorDataDao.setInsertData(actor13)
                mActorDataDao.setInsertData(actor14)
                mActorDataDao.setInsertData(actor15)
                mActorDataDao.setInsertData(actor16)
                mActorDataDao.setInsertData(actor17)
                mActorDataDao.setInsertData(actor18)
                mActorDataDao.setInsertData(actor19)
                mActorDataDao.setInsertData(actor20)
                mActorDataDao.setInsertData(actor21)
                mActorDataDao.setInsertData(actor22)
                mActorDataDao.setInsertData(actor23)
                mActorDataDao.setInsertData(actor24)
                mActorDataDao.setInsertData(actor25)
                mActorDataDao.setInsertData(actor26)
                mActorDataDao.setInsertData(actor27)
                mActorDataDao.setInsertData(actor28)
                mActorDataDao.setInsertData(actor29)
                mActorDataDao.setInsertData(actor30)
                mActorDataDao.setInsertData(actor31)
                mActorDataDao.setInsertData(actor32)
                mActorDataDao.setInsertData(actor33)
                mActorDataDao.setInsertData(actor34)
                mActorDataDao.setInsertData(actor35)
                mActorDataDao.setInsertData(actor36)
                mActorDataDao.setInsertData(actor37)
                mActorDataDao.setInsertData(actor38)
                mActorDataDao.setInsertData(actor39)
                mActorDataDao.setInsertData(actor40)
                mActorDataDao.setInsertData(actor41)
                mActorDataDao.setInsertData(actor42)
                mActorDataDao.setInsertData(actor43)
                mActorDataDao.setInsertData(actor44)
                mActorDataDao.setInsertData(actor45)
                mActorDataDao.setInsertData(actor46)
                mActorDataDao.setInsertData(actor47)
                mActorDataDao.setInsertData(actor48)
                mActorDataDao.setInsertData(actor49)
                mActorDataDao.setInsertData(actor50)
                mActorDataDao.setInsertData(actor51)
                mActorDataDao.setInsertData(actor52)
                mActorDataDao.setInsertData(actor53)
                mActorDataDao.setInsertData(actor54)
                mActorDataDao.setInsertData(actor55)
                mActorDataDao.setInsertData(actor56)
                mActorDataDao.setInsertData(actor57)
                mActorDataDao.setInsertData(actor58)
                mActorDataDao.setInsertData(actor59)
                mActorDataDao.setInsertData(actor60)
                mActorDataDao.setInsertData(actor61)
                mActorDataDao.setInsertData(actor62)
                mActorDataDao.setInsertData(actor63)
                mActorDataDao.setInsertData(actor64)
                mActorDataDao.setInsertData(actor65)
                mActorDataDao.setInsertData(actor66)
                mActorDataDao.setInsertData(actor67)
                mActorDataDao.setInsertData(actor68)
                mActorDataDao.setInsertData(actor69)
                mActorDataDao.setInsertData(actor70)
                mActorDataDao.setInsertData(actor71)
                mActorDataDao.setInsertData(actor72)
                mActorDataDao.setInsertData(actor73)
                mActorDataDao.setInsertData(actor74)
                mActorDataDao.setInsertData(actor75)
                mActorDataDao.setInsertData(actor76)
                mActorDataDao.setInsertData(actor77)
                mActorDataDao.setInsertData(actor78)
                mActorDataDao.setInsertData(actor79)
                mActorDataDao.setInsertData(actor80)
                mActorDataDao.setInsertData(actor81)
                mActorDataDao.setInsertData(actor82)
                mActorDataDao.setInsertData(actor83)
                mActorDataDao.setInsertData(actor84)
                mActorDataDao.setInsertData(actor85)
                mActorDataDao.setInsertData(actor86)
                mActorDataDao.setInsertData(actor87)
                mActorDataDao.setInsertData(actor88)
                mActorDataDao.setInsertData(actor89)
                mActorDataDao.setInsertData(actor90)
            }
            val place1 = PlaceData().apply {
                word = "화장실"
            }
            val place2 = PlaceData().apply {
                word = "야구장"
            }
            val place3 = PlaceData().apply {
                word = "도서관"
            }
            val place4 = PlaceData().apply {
                word = "공원"
            }
            val place5 = PlaceData().apply {
                word = "학교"
            }
            val place6 = PlaceData().apply {
                word = "식당"
            }
            val place7 = PlaceData().apply {
                word = "카페"
            }
            val place8 = PlaceData().apply {
                word = "병원"
            }
            val place9 = PlaceData().apply {
                word = "마트"
            }
            val place10 = PlaceData().apply {
                word = "백화점"
            }
            val place11 = PlaceData().apply {
                word = "영화관"
            }
            val place12 = PlaceData().apply {
                word = "버스정류장"
            }
            val place13 = PlaceData().apply {
                word = "지하철역"
            }
            val place14 = PlaceData().apply {
                word = "기차역"
            }
            val place15 = PlaceData().apply {
                word = "공항"
            }
            val place16 = PlaceData().apply {
                word = "바다"
            }
            val place17 = PlaceData().apply {
                word = "산"
            }
            val place18 = PlaceData().apply {
                word = "강"
            }
            val place19 = PlaceData().apply {
                word = "호수"
            }
            val place20 = PlaceData().apply {
                word = "놀이터"
            }
            val place21 = PlaceData().apply {
                word = "운동장"
            }
            val place22 = PlaceData().apply {
                word = "헬스장"
            }
            val place23 = PlaceData().apply {
                word = "회의실"
            }
            val place24 = PlaceData().apply {
                word = "강의실"
            }
            val place25 = PlaceData().apply {
                word = "실험실"
            }
            val place26 = PlaceData().apply {
                word = "교실"
            }
            val place27 = PlaceData().apply {
                word = "강당"
            }
            val place28 = PlaceData().apply {
                word = "체육관"
            }
            val place29 = PlaceData().apply {
                word = "수영장"
            }
            val place30 = PlaceData().apply {
                word = "미술관"
            }
            val place31 = PlaceData().apply {
                word = "경기장"
            }
            val place32 = PlaceData().apply {
                word = "축구장"
            }
            val place33 = PlaceData().apply {
                word = "스키장"
            }
            val place34 = PlaceData().apply {
                word = "놀이공원"
            }
            val place35 = PlaceData().apply {
                word = "동물원"
            }
            val place36 = PlaceData().apply {
                word = "식물원"
            }
            val place37 = PlaceData().apply {
                word = "수족관"
            }
            val place38 = PlaceData().apply {
                word = "미용실"
            }
            val place39 = PlaceData().apply {
                word = "네일샵"
            }
            val place40 = PlaceData().apply {
                word = "안경점"
            }
            val place41 = PlaceData().apply {
                word = "치과"
            }
            val place42 = PlaceData().apply {
                word = "약국"
            }
            val place43 = PlaceData().apply {
                word = "빵집"
            }
            val place44 = PlaceData().apply {
                word = "편의점"
            }
            val place45 = PlaceData().apply {
                word = "노래방"
            }
            val place46 = PlaceData().apply {
                word = "PC방"
            }
            val place47 = PlaceData().apply {
                word = "당구장"
            }
            val place48 = PlaceData().apply {
                word = "볼링장"
            }
            val place49 = PlaceData().apply {
                word = "클럽"
            }
            val place50 = PlaceData().apply {
                word = "사우나"
            }
            val place51 = PlaceData().apply {
                word = "찜질방"
            }
            val place52 = PlaceData().apply {
                word = "호텔"
            }
            val place53 = PlaceData().apply {
                word = "모텔"
            }
            val place54 = PlaceData().apply {
                word = "게스트하우스"
            }
            val place55 = PlaceData().apply {
                word = "민박"
            }
            val place56 = PlaceData().apply {
                word = "리조트"
            }
            val place57 = PlaceData().apply {
                word = "펜션"
            }
            val place58 = PlaceData().apply {
                word = "캠핑장"
            }
            val place59 = PlaceData().apply {
                word = "기숙사"
            }
            val place60 = PlaceData().apply {
                word = "아파트"
            }
            val place61 = PlaceData().apply {
                word = "오피스텔"
            }
            val place62 = PlaceData().apply {
                word = "고시원"
            }
            val place63 = PlaceData().apply {
                word = "촬영장"
            }
            val place64 = PlaceData().apply {
                word = "전시회"
            }
            val place65 = PlaceData().apply {
                word = "예식장"
            }
            val place66 = PlaceData().apply {
                word = "교회"
            }
            val place67 = PlaceData().apply {
                word = "절"
            }
            val place68 = PlaceData().apply {
                word = "묘지"
            }
            val place69 = PlaceData().apply {
                word = "섬"
            }

            if(mPlaceDataDao.getDataAll().isEmpty()) {
                mPlaceDataDao.setInsertData(place1)
                mPlaceDataDao.setInsertData(place2)
                mPlaceDataDao.setInsertData(place3)
                mPlaceDataDao.setInsertData(place4)
                mPlaceDataDao.setInsertData(place5)
                mPlaceDataDao.setInsertData(place6)
                mPlaceDataDao.setInsertData(place7)
                mPlaceDataDao.setInsertData(place8)
                mPlaceDataDao.setInsertData(place9)
                mPlaceDataDao.setInsertData(place10)
                mPlaceDataDao.setInsertData(place11)
                mPlaceDataDao.setInsertData(place12)
                mPlaceDataDao.setInsertData(place13)
                mPlaceDataDao.setInsertData(place14)
                mPlaceDataDao.setInsertData(place15)
                mPlaceDataDao.setInsertData(place16)
                mPlaceDataDao.setInsertData(place17)
                mPlaceDataDao.setInsertData(place18)
                mPlaceDataDao.setInsertData(place19)
                mPlaceDataDao.setInsertData(place20)
                mPlaceDataDao.setInsertData(place21)
                mPlaceDataDao.setInsertData(place22)
                mPlaceDataDao.setInsertData(place23)
                mPlaceDataDao.setInsertData(place24)
                mPlaceDataDao.setInsertData(place25)
                mPlaceDataDao.setInsertData(place26)
                mPlaceDataDao.setInsertData(place27)
                mPlaceDataDao.setInsertData(place28)
                mPlaceDataDao.setInsertData(place29)
                mPlaceDataDao.setInsertData(place30)
                mPlaceDataDao.setInsertData(place31)
                mPlaceDataDao.setInsertData(place32)
                mPlaceDataDao.setInsertData(place33)
                mPlaceDataDao.setInsertData(place34)
                mPlaceDataDao.setInsertData(place35)
                mPlaceDataDao.setInsertData(place36)
                mPlaceDataDao.setInsertData(place37)
                mPlaceDataDao.setInsertData(place38)
                mPlaceDataDao.setInsertData(place39)
                mPlaceDataDao.setInsertData(place40)
                mPlaceDataDao.setInsertData(place41)
                mPlaceDataDao.setInsertData(place42)
                mPlaceDataDao.setInsertData(place43)
                mPlaceDataDao.setInsertData(place44)
                mPlaceDataDao.setInsertData(place45)
                mPlaceDataDao.setInsertData(place46)
                mPlaceDataDao.setInsertData(place47)
                mPlaceDataDao.setInsertData(place48)
                mPlaceDataDao.setInsertData(place49)
                mPlaceDataDao.setInsertData(place50)
                mPlaceDataDao.setInsertData(place51)
                mPlaceDataDao.setInsertData(place52)
                mPlaceDataDao.setInsertData(place53)
                mPlaceDataDao.setInsertData(place54)
                mPlaceDataDao.setInsertData(place55)
                mPlaceDataDao.setInsertData(place56)
                mPlaceDataDao.setInsertData(place57)
                mPlaceDataDao.setInsertData(place58)
                mPlaceDataDao.setInsertData(place59)
                mPlaceDataDao.setInsertData(place60)
                mPlaceDataDao.setInsertData(place61)
                mPlaceDataDao.setInsertData(place62)
                mPlaceDataDao.setInsertData(place63)
                mPlaceDataDao.setInsertData(place64)
                mPlaceDataDao.setInsertData(place65)
                mPlaceDataDao.setInsertData(place66)
                mPlaceDataDao.setInsertData(place67)
                mPlaceDataDao.setInsertData(place68)
                mPlaceDataDao.setInsertData(place69)
            }

            val animal1 = AnimalData().apply {
                word = "고양이"
            }
            val animal2 = AnimalData().apply {
                word = "개"
            }
            val animal3 = AnimalData().apply {
                word = "말"
            }
            val animal4 = AnimalData().apply {
                word = "소"
            }
            val animal5 = AnimalData().apply {
                word = "돼지"
            }
            val animal6 = AnimalData().apply {
                word = "양"
            }
            val animal7 = AnimalData().apply {
                word = "염소"
            }
            val animal8 = AnimalData().apply {
                word = "토끼"
            }
            val animal9 = AnimalData().apply {
                word = "닭"
            }
            val animal10 = AnimalData().apply {
                word = "오리"
            }
            val animal11 = AnimalData().apply {
                word = "거위"
            }
            val animal12 = AnimalData().apply {
                word = "비둘기"
            }
            val animal13 = AnimalData().apply {
                word = "참새"
            }
            val animal14 = AnimalData().apply {
                word = "제비"
            }
            val animal15 = AnimalData().apply {
                word = "독수리"
            }
            val animal16 = AnimalData().apply {
                word = "매"
            }
            val animal17 = AnimalData().apply {
                word = "까마귀"
            }
            val animal18 = AnimalData().apply {
                word = "부엉이"
            }
            val animal19 = AnimalData().apply {
                word = "공작"
            }
            val animal20 = AnimalData().apply {
                word = "앵무새"
            }
            val animal21 = AnimalData().apply {
                word = "타조"
            }
            val animal22 = AnimalData().apply {
                word = "펭귄"
            }
            val animal23 = AnimalData().apply {
                word = "코끼리"
            }
            val animal24 = AnimalData().apply {
                word = "기린"
            }
            val animal25 = AnimalData().apply {
                word = "사자"
            }
            val animal26 = AnimalData().apply {
                word = "호랑이"
            }
            val animal27 = AnimalData().apply {
                word = "표범"
            }
            val animal28 = AnimalData().apply {
                word = "재규어"
            }
            val animal29 = AnimalData().apply {
                word = "치타"
            }
            val animal30 = AnimalData().apply {
                word = "곰"
            }
            val animal31 = AnimalData().apply {
                word = "판다"
            }
            val animal32 = AnimalData().apply {
                word = "코알라"
            }
            val animal33 = AnimalData().apply {
                word = "캥거루"
            }
            val animal34 = AnimalData().apply {
                word = "하마"
            }
            val animal35 = AnimalData().apply {
                word = "코뿔소"
            }
            val animal36 = AnimalData().apply {
                word = "악어"
            }
            val animal37 = AnimalData().apply {
                word = "고릴라"
            }
            val animal38 = AnimalData().apply {
                word = "침팬지"
            }
            val animal39 = AnimalData().apply {
                word = "여우"
            }
            val animal40 = AnimalData().apply {
                word = "늑대"
            }
            val animal41 = AnimalData().apply {
                word = "너구리"
            }
            val animal42 = AnimalData().apply {
                word = "담비"
            }
            val animal43 = AnimalData().apply {
                word = "족제비"
            }
            val animal44 = AnimalData().apply {
                word = "수달"
            }
            val animal45 = AnimalData().apply {
                word = "물개"
            }
            val animal46 = AnimalData().apply {
                word = "바다표범"
            }
            val animal47 = AnimalData().apply {
                word = "거북이"
            }
            val animal48 = AnimalData().apply {
                word = "악어"
            }

            if(mAnimalDataDao.getDataAll().isEmpty()) {
                mAnimalDataDao.setInsertData(animal1)
                mAnimalDataDao.setInsertData(animal2)
                mAnimalDataDao.setInsertData(animal3)
                mAnimalDataDao.setInsertData(animal4)
                mAnimalDataDao.setInsertData(animal5)
                mAnimalDataDao.setInsertData(animal6)
                mAnimalDataDao.setInsertData(animal7)
                mAnimalDataDao.setInsertData(animal8)
                mAnimalDataDao.setInsertData(animal9)
                mAnimalDataDao.setInsertData(animal10)
                mAnimalDataDao.setInsertData(animal11)
                mAnimalDataDao.setInsertData(animal12)
                mAnimalDataDao.setInsertData(animal13)
                mAnimalDataDao.setInsertData(animal14)
                mAnimalDataDao.setInsertData(animal15)
                mAnimalDataDao.setInsertData(animal16)
                mAnimalDataDao.setInsertData(animal17)
                mAnimalDataDao.setInsertData(animal18)
                mAnimalDataDao.setInsertData(animal19)
                mAnimalDataDao.setInsertData(animal20)
                mAnimalDataDao.setInsertData(animal21)
                mAnimalDataDao.setInsertData(animal22)
                mAnimalDataDao.setInsertData(animal23)
                mAnimalDataDao.setInsertData(animal24)
                mAnimalDataDao.setInsertData(animal25)
                mAnimalDataDao.setInsertData(animal26)
                mAnimalDataDao.setInsertData(animal27)
                mAnimalDataDao.setInsertData(animal28)
                mAnimalDataDao.setInsertData(animal29)
                mAnimalDataDao.setInsertData(animal30)
                mAnimalDataDao.setInsertData(animal31)
                mAnimalDataDao.setInsertData(animal32)
                mAnimalDataDao.setInsertData(animal33)
                mAnimalDataDao.setInsertData(animal34)
                mAnimalDataDao.setInsertData(animal35)
                mAnimalDataDao.setInsertData(animal36)
                mAnimalDataDao.setInsertData(animal37)
                mAnimalDataDao.setInsertData(animal38)
                mAnimalDataDao.setInsertData(animal39)
                mAnimalDataDao.setInsertData(animal40)
                mAnimalDataDao.setInsertData(animal41)
                mAnimalDataDao.setInsertData(animal42)
                mAnimalDataDao.setInsertData(animal43)
                mAnimalDataDao.setInsertData(animal44)
                mAnimalDataDao.setInsertData(animal45)
                mAnimalDataDao.setInsertData(animal46)
                mAnimalDataDao.setInsertData(animal47)
                mAnimalDataDao.setInsertData(animal48)
            }

            val famous1 = FamousData().apply {
                word = "테일러 스위프트"
            }
            val famous2 = FamousData().apply {
                word = "로버트 다우니 주니어"
            }
            val famous3 = FamousData().apply {
                word = "비욘세"
            }
            val famous4 = FamousData().apply {
                word = "일론 머스크"
            }
            val famous5 = FamousData().apply {
                word = "드웨인 존슨"
            }
            val famous6 = FamousData().apply {
                word = "톰 크루즈"
            }
            val famous7 = FamousData().apply {
                word = "윌 스미스"
            }
            val famous8 = FamousData().apply {
                word = "아리아나 그란데"
            }
            val famous9 = FamousData().apply {
                word = "브래드 피트"
            }
            val famous10 = FamousData().apply {
                word = "안젤리나 졸리"
            }
            val famous11 = FamousData().apply {
                word = "에드 시런"
            }
            val famous12 = FamousData().apply {
                word = "스칼렛 요한슨"
            }
            val famous13 = FamousData().apply {
                word = "리오넬 메시"
            }
            val famous14 = FamousData().apply {
                word = "크리스티아누 호날두"
            }
            val famous15 = FamousData().apply {
                word = "빌 게이츠"
            }
            val famous16 = FamousData().apply {
                word = "마크 저커버그"
            }
            val famous17 = FamousData().apply {
                word = "스티븐 스필버그"
            }
            val famous18 = FamousData().apply {
                word = "레오나르도 디카프리오"
            }
            val famous19 = FamousData().apply {
                word = "톰 행크스"
            }
            val famous20 = FamousData().apply {
                word = "키아누 리브스"
            }
            val famous21 = FamousData().apply {
                word = "마돈나"
            }
            val famous22 = FamousData().apply {
                word = "바락 오바마"
            }
            val famous23 = FamousData().apply {
                word = "도널드 트럼프"
            }
            val famous24 = FamousData().apply {
                word = "조 바이든"
            }
            val famous25 = FamousData().apply {
                word = "JK 롤링"
            }
            val famous26 = FamousData().apply {
                word = "스티븐 호킹"
            }
            val famous27 = FamousData().apply {
                word = "앨버트 아인슈타인"
            }
            val famous28 = FamousData().apply {
                word = "마릴린 먼로"
            }
            val famous29 = FamousData().apply {
                word = "오드리 헵번"
            }
            val famous30 = FamousData().apply {
                word = "프레디 머큐리"
            }
            val famous31 = FamousData().apply {
                word = "마이클 잭슨"
            }
            val famous32 = FamousData().apply {
                word = "엘비스 프레슬리"
            }
            val famous33 = FamousData().apply {
                word = "에미넴"
            }
            val famous34 = FamousData().apply {
                word = "저스틴 비버"
            }
            val famous35 = FamousData().apply {
                word = "레이디 가가"
            }
            val famous36 = FamousData().apply {
                word = "샘 스미스"
            }
            val famous37 = FamousData().apply {
                word = "빌리 아일리시"
            }

            if(mFamousDataDao.getDataAll().isEmpty()) {
                mFamousDataDao.setInsertData(famous1)
                mFamousDataDao.setInsertData(famous2)
                mFamousDataDao.setInsertData(famous3)
                mFamousDataDao.setInsertData(famous4)
                mFamousDataDao.setInsertData(famous5)
                mFamousDataDao.setInsertData(famous6)
                mFamousDataDao.setInsertData(famous7)
                mFamousDataDao.setInsertData(famous8)
                mFamousDataDao.setInsertData(famous9)
                mFamousDataDao.setInsertData(famous10)
                mFamousDataDao.setInsertData(famous11)
                mFamousDataDao.setInsertData(famous12)
                mFamousDataDao.setInsertData(famous13)
                mFamousDataDao.setInsertData(famous14)
                mFamousDataDao.setInsertData(famous15)
                mFamousDataDao.setInsertData(famous16)
                mFamousDataDao.setInsertData(famous17)
                mFamousDataDao.setInsertData(famous18)
                mFamousDataDao.setInsertData(famous19)
                mFamousDataDao.setInsertData(famous20)
                mFamousDataDao.setInsertData(famous21)
                mFamousDataDao.setInsertData(famous22)
                mFamousDataDao.setInsertData(famous23)
                mFamousDataDao.setInsertData(famous24)
                mFamousDataDao.setInsertData(famous25)
                mFamousDataDao.setInsertData(famous26)
                mFamousDataDao.setInsertData(famous27)
                mFamousDataDao.setInsertData(famous28)
                mFamousDataDao.setInsertData(famous29)
                mFamousDataDao.setInsertData(famous30)
                mFamousDataDao.setInsertData(famous31)
                mFamousDataDao.setInsertData(famous32)
                mFamousDataDao.setInsertData(famous33)
                mFamousDataDao.setInsertData(famous34)
                mFamousDataDao.setInsertData(famous35)
                mFamousDataDao.setInsertData(famous36)
                mFamousDataDao.setInsertData(famous37)
            }

            val oldfbplayer1 = OldFBData().apply {
                word = "펠레"
            }
            val oldfbplayer2 = OldFBData().apply {
                word = "지네딘 지단"
            }
            val oldfbplayer3 = OldFBData().apply {
                word = "호나우두"
            }
            val oldfbplayer4 = OldFBData().apply {
                word = "요한 크루이프"
            }
            val oldfbplayer5 = OldFBData().apply {
                word = "페렌츠 푸스카스"
            }
            val oldfbplayer6 = OldFBData().apply {
                word = "파올로 말디니"
            }
            val oldfbplayer7 = OldFBData().apply {
                word = "로베르토 바조"
            }
            val oldfbplayer8 = OldFBData().apply {
                word = "사비 에르난데스"
            }
            val oldfbplayer9 = OldFBData().apply {
                word = "호나우지뉴"
            }
            val oldfbplayer10 = OldFBData().apply {
                word = "루드 굴리트"
            }
            val oldfbplayer11 = OldFBData().apply {
                word = "에우제비우"
            }
            val oldfbplayer12 = OldFBData().apply {
                word = "앨런 시어러"
            }
            val oldfbplayer13 = OldFBData().apply {
                word = "데이비드 베컴"
            }
            val oldfbplayer14 = OldFBData().apply {
                word = "호베르투 카를루스"
            }
            val oldfbplayer15 = OldFBData().apply {
                word = "티에리 앙리"
            }
            val oldfbplayer16 = OldFBData().apply {
                word = "카시야스"
            }
            val oldfbplayer17 = OldFBData().apply {
                word = "루이스 피구"
            }
            val oldfbplayer18 = OldFBData().apply {
                word = "안드레아 피를로"
            }
            val oldfbplayer19 = OldFBData().apply {
                word = "사무엘 에토"
            }
            val oldfbplayer20 = OldFBData().apply {
                word = "안드리 셰우첸코"
            }
            val oldfbplayer21 = OldFBData().apply {
                word = "디디에 드로그바"
            }
            val oldfbplayer22 = OldFBData().apply {
                word = "웨인 루니"
            }
            val oldfbplayer23 = OldFBData().apply {
                word = "카카"
            }
            val oldfbplayer24 = OldFBData().apply {
                word = "에릭 칸토나"
            }
            val oldfbplayer25 = OldFBData().apply {
                word = "프랑크 레이카르트"
            }
            val oldfbplayer26 = OldFBData().apply {
                word = "데니스 베르캄프"
            }
            val oldfbplayer27 = OldFBData().apply {
                word = "마이클 오언"
            }
            val oldfbplayer28 = OldFBData().apply {
                word = "네드베드"
            }
            val oldfbplayer29 = OldFBData().apply {
                word = "로빈 반페르시"
            }
            val oldfbplayer30 = OldFBData().apply {
                word = "뤼트 반니스텔로이"
            }
            val oldfbplayer31 = OldFBData().apply {
                word = "카를레스 푸욜"
            }
            val oldfbplayer32 = OldFBData().apply {
                word = "샤비 알론소"
            }
            val oldfbplayer33 = OldFBData().apply {
                word = "라울"
            }
            val oldfbplayer34 = OldFBData().apply {
                word = "필립 람"
            }
            val oldfbplayer35 = OldFBData().apply {
                word = "차범근"
            }
            val oldfbplayer36 = OldFBData().apply {
                word = "레프 야신"
            }
            val oldfbplayer37 = OldFBData().apply {
                word = "폴 스콜스"
            }
            val oldfbplayer38 = OldFBData().apply {
                word = "필리포 인자기"
            }
            val oldfbplayer39 = OldFBData().apply {
                word = "미하엘 발락"
            }
            val oldfbplayer40 = OldFBData().apply {
                word = "프랭크 램파드"
            }
            val oldfbplayer41 = OldFBData().apply {
                word = "리오 퍼디난드"
            }
            val oldfbplayer42 = OldFBData().apply {
                word = "스티븐 제라드"
            }
            val oldfbplayer43 = OldFBData().apply {
                word = "야야 투레"
            }
            val oldfbplayer44 = OldFBData().apply {
                word = "박지성"
            }
            val oldfbplayer45 = OldFBData().apply {
                word = "페트르 체흐"
            }
            val oldfbplayer46 = OldFBData().apply {
                word = "페르난도 토레스"
            }
            val oldfbplayer47 = OldFBData().apply {
                word = "프랑크 리베리"
            }
            val oldfbplayer48 = OldFBData().apply {
                word = "라이언 긱스"
            }
            val oldfbplayer49 = OldFBData().apply {
                word = "에마뉘엘 프티"
            }
            val oldfbplayer50 = OldFBData().apply {
                word = "클라위베르트"
            }
            val oldfbplayer51 = OldFBData().apply {
                word = "마이클 에시앙"
            }
            val oldfbplayer52 = OldFBData().apply {
                word = "에드윈 반데르사르"
            }
            val oldfbplayer53 = OldFBData().apply {
                word = "네마냐 미디치"
            }
            val oldfbplayer54 = OldFBData().apply {
                word = "솔 캠벨"
            }
            val oldfbplayer55 = OldFBData().apply {
                word = "과르디올라"
            }
            val oldfbplayer56 = OldFBData().apply {
                word = "올레 군나르 솔샤르"
            }

            if(mOldDataDao.getDataAll().isEmpty()) {
                mOldDataDao.setInsertData(oldfbplayer1)
                mOldDataDao.setInsertData(oldfbplayer2)
                mOldDataDao.setInsertData(oldfbplayer3)
                mOldDataDao.setInsertData(oldfbplayer4)
                mOldDataDao.setInsertData(oldfbplayer5)
                mOldDataDao.setInsertData(oldfbplayer6)
                mOldDataDao.setInsertData(oldfbplayer7)
                mOldDataDao.setInsertData(oldfbplayer8)
                mOldDataDao.setInsertData(oldfbplayer9)
                mOldDataDao.setInsertData(oldfbplayer10)
                mOldDataDao.setInsertData(oldfbplayer11)
                mOldDataDao.setInsertData(oldfbplayer12)
                mOldDataDao.setInsertData(oldfbplayer13)
                mOldDataDao.setInsertData(oldfbplayer14)
                mOldDataDao.setInsertData(oldfbplayer15)
                mOldDataDao.setInsertData(oldfbplayer16)
                mOldDataDao.setInsertData(oldfbplayer17)
                mOldDataDao.setInsertData(oldfbplayer18)
                mOldDataDao.setInsertData(oldfbplayer19)
                mOldDataDao.setInsertData(oldfbplayer20)
                mOldDataDao.setInsertData(oldfbplayer21)
                mOldDataDao.setInsertData(oldfbplayer22)
                mOldDataDao.setInsertData(oldfbplayer23)
                mOldDataDao.setInsertData(oldfbplayer24)
                mOldDataDao.setInsertData(oldfbplayer25)
                mOldDataDao.setInsertData(oldfbplayer26)
                mOldDataDao.setInsertData(oldfbplayer27)
                mOldDataDao.setInsertData(oldfbplayer28)
                mOldDataDao.setInsertData(oldfbplayer29)
                mOldDataDao.setInsertData(oldfbplayer30)
                mOldDataDao.setInsertData(oldfbplayer31)
                mOldDataDao.setInsertData(oldfbplayer32)
                mOldDataDao.setInsertData(oldfbplayer33)
                mOldDataDao.setInsertData(oldfbplayer34)
                mOldDataDao.setInsertData(oldfbplayer35)
                mOldDataDao.setInsertData(oldfbplayer36)
                mOldDataDao.setInsertData(oldfbplayer37)
                mOldDataDao.setInsertData(oldfbplayer38)
                mOldDataDao.setInsertData(oldfbplayer39)
                mOldDataDao.setInsertData(oldfbplayer40)
                mOldDataDao.setInsertData(oldfbplayer41)
                mOldDataDao.setInsertData(oldfbplayer42)
                mOldDataDao.setInsertData(oldfbplayer43)
                mOldDataDao.setInsertData(oldfbplayer44)
                mOldDataDao.setInsertData(oldfbplayer45)
                mOldDataDao.setInsertData(oldfbplayer46)
                mOldDataDao.setInsertData(oldfbplayer47)
                mOldDataDao.setInsertData(oldfbplayer48)
                mOldDataDao.setInsertData(oldfbplayer49)
                mOldDataDao.setInsertData(oldfbplayer50)
                mOldDataDao.setInsertData(oldfbplayer51)
                mOldDataDao.setInsertData(oldfbplayer52)
                mOldDataDao.setInsertData(oldfbplayer53)
                mOldDataDao.setInsertData(oldfbplayer54)
                mOldDataDao.setInsertData(oldfbplayer55)
                mOldDataDao.setInsertData(oldfbplayer56)
            }

            val manager1 = ManagerData().apply {
                word = "지네딘 지단"
            }
            val manager2 = ManagerData().apply {
                word = "펩 과르디올라"
            }
            val manager3 = ManagerData().apply {
                word = "위르겐 클롭"
            }
            val manager4 = ManagerData().apply {
                word = "디에고 시메오네"
            }
            val manager5 = ManagerData().apply {
                word = "마우리시오 포체티노"
            }
            val manager6 = ManagerData().apply {
                word = "카를로 안첼로티"
            }
            val manager7 = ManagerData().apply {
                word = "토마스 투헬"
            }
            val manager8 = ManagerData().apply {
                word = "로베르토 만치니"
            }
            val manager9 = ManagerData().apply {
                word = "안토니오 콘테"
            }
            val manager10 = ManagerData().apply {
                word = "조제 무리뉴"
            }
            val manager11 = ManagerData().apply {
                word = "마르셀로 비엘사"
            }
            val manager12 = ManagerData().apply {
                word = "루이스 엔리케"
            }
            val manager13 = ManagerData().apply {
                word = "아르센 뱅거"
            }
            val manager14 = ManagerData().apply {
                word = "디디에 데샹"
            }
            val manager15 = ManagerData().apply {
                word = "에릭 텐 하흐"
            }
            val manager16 = ManagerData().apply {
                word = "줄리안 나겔스만"
            }
            val manager17 = ManagerData().apply {
                word = "브렌던 로저스"
            }
            val manager18 = ManagerData().apply {
                word = "우나이 에메리"
            }
            val manager19 = ManagerData().apply {
                word = "로날드 쿠만"
            }
            val manager20 = ManagerData().apply {
                word = "프랭크 램파드"
            }
            val manager21 = ManagerData().apply {
                word = "스티븐 제라드"
            }
            val manager22 = ManagerData().apply {
                word = "안드레 빌라스 보아스"
            }
            val manager23 = ManagerData().apply {
                word = "사우스게이트"
            }
            val manager24 = ManagerData().apply {
                word = "사비 알론소"
            }
            val manager25 = ManagerData().apply {
                word = "엔제 포스테코글루"
            }
            val manager26 = ManagerData().apply {
                word = "에디 하우"
            }
            val manager27 = ManagerData().apply {
                word = "데이비드 모예스"
            }
            val manager28 = ManagerData().apply {
                word = "누누 에스피리투 산투"
            }
            val manager29 = ManagerData().apply {
                word = "빈센트 콤파니"
            }
            val manager30 = ManagerData().apply {
                word = "챠비 에르난데스"
            }
            val manager31 = ManagerData().apply {
                word = "염기훈"
            }
            val manager32 = ManagerData().apply {
                word = "이정효"
            }
            val manager33 = ManagerData().apply {
                word = "이민성"
            }
            val manager34 = ManagerData().apply {
                word = "홍명보"
            }
            val manager35 = ManagerData().apply {
                word = "김학범"
            }
            val manager36 = ManagerData().apply {
                word = "신태용"
            }
            val manager37 = ManagerData().apply {
                word = "박항서"
            }
            val manager38 = ManagerData().apply {
                word = "허정무"
            }
            val manager39 = ManagerData().apply {
                word = "최강희"
            }
            val manager40 = ManagerData().apply {
                word = "최용수"
            }
            val manager41 = ManagerData().apply {
                word = "황선홍"
            }

            if(mManagerDataDao.getDataAll().isEmpty()) {
                mManagerDataDao.setInsertData(manager1)
                mManagerDataDao.setInsertData(manager2)
                mManagerDataDao.setInsertData(manager3)
                mManagerDataDao.setInsertData(manager4)
                mManagerDataDao.setInsertData(manager5)
                mManagerDataDao.setInsertData(manager6)
                mManagerDataDao.setInsertData(manager7)
                mManagerDataDao.setInsertData(manager8)
                mManagerDataDao.setInsertData(manager9)
                mManagerDataDao.setInsertData(manager10)
                mManagerDataDao.setInsertData(manager11)
                mManagerDataDao.setInsertData(manager12)
                mManagerDataDao.setInsertData(manager13)
                mManagerDataDao.setInsertData(manager14)
                mManagerDataDao.setInsertData(manager15)
                mManagerDataDao.setInsertData(manager16)
                mManagerDataDao.setInsertData(manager17)
                mManagerDataDao.setInsertData(manager18)
                mManagerDataDao.setInsertData(manager19)
                mManagerDataDao.setInsertData(manager20)
                mManagerDataDao.setInsertData(manager21)
                mManagerDataDao.setInsertData(manager22)
                mManagerDataDao.setInsertData(manager23)
                mManagerDataDao.setInsertData(manager24)
                mManagerDataDao.setInsertData(manager25)
                mManagerDataDao.setInsertData(manager26)
                mManagerDataDao.setInsertData(manager27)
                mManagerDataDao.setInsertData(manager28)
                mManagerDataDao.setInsertData(manager29)
                mManagerDataDao.setInsertData(manager30)
                mManagerDataDao.setInsertData(manager31)
                mManagerDataDao.setInsertData(manager32)
                mManagerDataDao.setInsertData(manager33)
                mManagerDataDao.setInsertData(manager34)
                mManagerDataDao.setInsertData(manager35)
                mManagerDataDao.setInsertData(manager36)
                mManagerDataDao.setInsertData(manager37)
                mManagerDataDao.setInsertData(manager38)
                mManagerDataDao.setInsertData(manager39)
                mManagerDataDao.setInsertData(manager40)
                mManagerDataDao.setInsertData(manager41)
            }
            val sports1 = SportsData().apply {
                word = "김연경"
            }
            val sports2 = SportsData().apply {
                word = "김연아"
            }
            val sports3 = SportsData().apply {
                word = "류현진"
            }
            val sports4 = SportsData().apply {
                word = "추신수"
            }
            val sports5 = SportsData().apply {
                word = "박태환"
            }
            val sports6 = SportsData().apply {
                word = "이상화"
            }
            val sports7 = SportsData().apply {
                word = "최두호"
            }
            val sports8 = SportsData().apply {
                word = "강정호"
            }
            val sports9 = SportsData().apply {
                word = "오승환"
            }
            val sports10 = SportsData().apply {
                word = "이대호"
            }
            val sports11 = SportsData().apply {
                word = "이승엽"
            }
            val sports12 = SportsData().apply {
                word = "박찬호"
            }
            val sports13 = SportsData().apply {
                word = "박세리"
            }
            val sports14 = SportsData().apply {
                word = "김동현"
            }
            val sports15 = SportsData().apply {
                word = "정찬성"
            }
            val sports16 = SportsData().apply {
                word = "최홍만"
            }
            val sports17 = SportsData().apply {
                word = "르브론 제임스"
            }
            val sports18 = SportsData().apply {
                word = "로저 페더러"
            }
            val sports19 = SportsData().apply {
                word = "우사인 볼트"
            }
            val sports20 = SportsData().apply {
                word = "마이클 펠프스"
            }
            val sports21 = SportsData().apply {
                word = "노박 조코비치"
            }
            val sports22 = SportsData().apply {
                word = "타이거 우즈"
            }
            val sports23 = SportsData().apply {
                word = "스테판 커리"
            }
            val sports24 = SportsData().apply {
                word = "마이클 조던"
            }
            val sports25 = SportsData().apply {
                word = "매니 파퀴아오"
            }
            val sports26 = SportsData().apply {
                word = "코비 브라이언트"
            }
            val sports27 = SportsData().apply {
                word = "플로이드 매이웨더 주니어"
            }
            val sports28 = SportsData().apply {
                word = "존 존스"
            }
            val sports29 = SportsData().apply {
                word = "코너 맥그리거"
            }
            val sports30 = SportsData().apply {
                word = "드웨인 존슨"
            }
            val sports31 = SportsData().apply {
                word = "이스라엘 아데산야"
            }
            val sports32 = SportsData().apply {
                word = "프란시스 은가누"
            }
            val sports33 = SportsData().apply {
                word = "라파엘 나달"
            }
            val sports34 = SportsData().apply {
                word = "로저 페더러"
            }
            val sports35 = SportsData().apply {
                word = "무하마드 알리"
            }
            val sports36 = SportsData().apply {
                word = "마이클 타이슨"
            }
            val sports37 = SportsData().apply {
                word = "마리아 샤라포바"
            }
            val sports38 = SportsData().apply {
                word = "오타니 쇼헤이"
            }
            val sports39 = SportsData().apply {
                word = "클레이튼 커쇼"
            }
            val sports40 = SportsData().apply {
                word = "이봉주"
            }
            val sports41 = SportsData().apply {
                word = "하승진"
            }
            val sports42 = SportsData().apply {
                word = "강호동"
            }
            val sports43 = SportsData().apply {
                word = "서장훈"
            }

            if(mSportsDataDao.getDataAll().isEmpty()) {
                mSportsDataDao.setInsertData(sports1)
                mSportsDataDao.setInsertData(sports2)
                mSportsDataDao.setInsertData(sports3)
                mSportsDataDao.setInsertData(sports4)
                mSportsDataDao.setInsertData(sports5)
                mSportsDataDao.setInsertData(sports6)
                mSportsDataDao.setInsertData(sports7)
                mSportsDataDao.setInsertData(sports8)
                mSportsDataDao.setInsertData(sports9)
                mSportsDataDao.setInsertData(sports10)
                mSportsDataDao.setInsertData(sports11)
                mSportsDataDao.setInsertData(sports12)
                mSportsDataDao.setInsertData(sports13)
                mSportsDataDao.setInsertData(sports14)
                mSportsDataDao.setInsertData(sports15)
                mSportsDataDao.setInsertData(sports16)
                mSportsDataDao.setInsertData(sports17)
                mSportsDataDao.setInsertData(sports18)
                mSportsDataDao.setInsertData(sports19)
                mSportsDataDao.setInsertData(sports20)
                mSportsDataDao.setInsertData(sports21)
                mSportsDataDao.setInsertData(sports22)
                mSportsDataDao.setInsertData(sports23)
                mSportsDataDao.setInsertData(sports24)
                mSportsDataDao.setInsertData(sports25)
                mSportsDataDao.setInsertData(sports26)
                mSportsDataDao.setInsertData(sports27)
                mSportsDataDao.setInsertData(sports28)
                mSportsDataDao.setInsertData(sports29)
                mSportsDataDao.setInsertData(sports30)
                mSportsDataDao.setInsertData(sports31)
                mSportsDataDao.setInsertData(sports32)
                mSportsDataDao.setInsertData(sports33)
                mSportsDataDao.setInsertData(sports34)
                mSportsDataDao.setInsertData(sports35)
                mSportsDataDao.setInsertData(sports36)
                mSportsDataDao.setInsertData(sports37)
                mSportsDataDao.setInsertData(sports38)
                mSportsDataDao.setInsertData(sports39)
                mSportsDataDao.setInsertData(sports40)
                mSportsDataDao.setInsertData(sports41)
                mSportsDataDao.setInsertData(sports42)
                mSportsDataDao.setInsertData(sports43)
            }

            val free1 = FreeData().apply {
                word = "여행"
            }
            val free2 = FreeData().apply {
                word = "음악"
            }
            val free3 = FreeData().apply {
                word = "책"
            }
            val free4 = FreeData().apply {
                word = "영화"
            }
            val free5 = FreeData().apply {
                word = "음식"
            }
            val free6 = FreeData().apply {
                word = "운동"
            }
            val free7 = FreeData().apply {
                word = "요리"
            }
            val free8 = FreeData().apply {
                word = "사진"
            }
            val free9 = FreeData().apply {
                word = "패션"
            }
            val free10 = FreeData().apply {
                word = "게임"
            }
            val free11 = FreeData().apply {
                word = "드라마"
            }
            val free12 = FreeData().apply {
                word = "공부"
            }
            val free13 = FreeData().apply {
                word = "언어"
            }
            val free14 = FreeData().apply {
                word = "산책"
            }
            val free15 = FreeData().apply {
                word = "등산"
            }
            val free16 = FreeData().apply {
                word = "캠핑"
            }
            val free17 = FreeData().apply {
                word = "낚시"
            }
            val free18 = FreeData().apply {
                word = "자동차"
            }
            val free19 = FreeData().apply {
                word = "바이크"
            }
            val free20 = FreeData().apply {
                word = "여행지"
            }
            val free21 = FreeData().apply {
                word = "카페"
            }
            val free22 = FreeData().apply {
                word = "박물관"
            }
            val free23 = FreeData().apply {
                word = "미술관"
            }
            val free24 = FreeData().apply {
                word = "전시회"
            }
            val free25 = FreeData().apply {
                word = "공연"
            }
            val free26 = FreeData().apply {
                word = "콘서트"
            }
            val free27 = FreeData().apply {
                word = "놀이공원"
            }
            val free28 = FreeData().apply {
                word = "동물원"
            }
            val free29 = FreeData().apply {
                word = "아쿠아리움"
            }
            val free30 = FreeData().apply {
                word = "도서관"
            }
            val free31 = FreeData().apply {
                word = "영화관"
            }
            val free32 = FreeData().apply {
                word = "시장"
            }
            val free33 = FreeData().apply {
                word = "쇼핑"
            }
            val free34 = FreeData().apply {
                word = "백화점"
            }
            val free35 = FreeData().apply {
                word = "마트"
            }
            val free36 = FreeData().apply {
                word = "가구"
            }
            val free37 = FreeData().apply {
                word = "정원"
            }
            val free38 = FreeData().apply {
                word = "식물"
            }
            val free39 = FreeData().apply {
                word = "꽃"
            }
            val free40 = FreeData().apply {
                word = "일기"
            }
            val free41 = FreeData().apply {
                word = "블로그"
            }
            val free42 = FreeData().apply {
                word = "유튜브"
            }
            val free43 = FreeData().apply {
                word = "부동산"
            }
            val free44 = FreeData().apply {
                word = "주식"
            }
            val free45 = FreeData().apply {
                word = "암호화폐"
            }
            val free46 = FreeData().apply {
                word = "우주"
            }
            val free47 = FreeData().apply {
                word = "천문학"
            }
            val free48 = FreeData().apply {
                word = "물리학"
            }
            val free49 = FreeData().apply {
                word = "화학"
            }
            val free50 = FreeData().apply {
                word = "생물학"
            }
            val free51 = FreeData().apply {
                word = "지구과학"
            }
            val free52 = FreeData().apply {
                word = "수학"
            }
            val free53 = FreeData().apply {
                word = "철학"
            }
            val free54 = FreeData().apply {
                word = "심리학"
            }
            val free55 = FreeData().apply {
                word = "수영"
            }
            val free56 = FreeData().apply {
                word = "서핑"
            }
            val free57 = FreeData().apply {
                word = "스키"
            }
            val free58 = FreeData().apply {
                word = "등산"
            }
            val free59 = FreeData().apply {
                word = "산책"
            }
            val free60 = FreeData().apply {
                word = "요트"
            }
            val free61 = FreeData().apply {
                word = "스카이다이빙"
            }
            val free62 = FreeData().apply {
                word = "번지점프"
            }
            val free63 = FreeData().apply {
                word = "요가"
            }
            val free64 = FreeData().apply {
                word = "명상"
            }
            val free65 = FreeData().apply {
                word = "스트레칭"
            }
            val free66 = FreeData().apply {
                word = "헬스"
            }
            val free67 = FreeData().apply {
                word = "체육관"
            }
            val free68 = FreeData().apply {
                word = "발레"
            }
            val free69 = FreeData().apply {
                word = "힙합"
            }
            val free70 = FreeData().apply {
                word = "탱고"
            }
            val free71 = FreeData().apply {
                word = "럭비"
            }
            val free72 = FreeData().apply {
                word = "아이스하키"
            }
            val free73 = FreeData().apply {
                word = "농구"
            }
            val free74 = FreeData().apply {
                word = "배구"
            }
            val free75 = FreeData().apply {
                word = "야구"
            }
            val free76 = FreeData().apply {
                word = "테니스"
            }
            val free77 = FreeData().apply {
                word = "배드민턴"
            }
            val free78 = FreeData().apply {
                word = "탁구"
            }
            val free79 = FreeData().apply {
                word = "스쿼시"
            }
            val free80 = FreeData().apply {
                word = "골프"
            }
            val free81 = FreeData().apply {
                word = "풋살"
            }
            val free82 = FreeData().apply {
                word = "핸드볼"
            }
            val free83 = FreeData().apply {
                word = "복싱"
            }
            val free84 = FreeData().apply {
                word = "킥복싱"
            }
            val free85 = FreeData().apply {
                word = "태권도"
            }
            val free86 = FreeData().apply {
                word = "유도"
            }
            val free87 = FreeData().apply {
                word = "검도"
            }
            val free88 = FreeData().apply {
                word = "주짓수"
            }
            val free89 = FreeData().apply {
                word = "레슬링"
            }
            val free90 = FreeData().apply {
                word = "무에타이"
            }
            val free91 = FreeData().apply {
                word = "카포에이라"
            }
            val free92 = FreeData().apply {
                word = "펜싱"
            }
            val free93 = FreeData().apply {
                word = "양궁"
            }
            val free94 = FreeData().apply {
                word = "사격"
            }
            val free95 = FreeData().apply {
                word = "승마"
            }
            val free96 = FreeData().apply {
                word = "경마"
            }
            val free97 = FreeData().apply {
                word = "수영"
            }
            val free98 = FreeData().apply {
                word = "다이빙"
            }
            val free99 = FreeData().apply {
                word = "수구"
            }
            val free100 = FreeData().apply {
                word = "자동차 경주"
            }

            if(mFreeDataDao.getDataAll().isEmpty()) {
                mFreeDataDao.setInsertData(free1)
                mFreeDataDao.setInsertData(free2)
                mFreeDataDao.setInsertData(free3)
                mFreeDataDao.setInsertData(free4)
                mFreeDataDao.setInsertData(free5)
                mFreeDataDao.setInsertData(free6)
                mFreeDataDao.setInsertData(free7)
                mFreeDataDao.setInsertData(free8)
                mFreeDataDao.setInsertData(free9)
                mFreeDataDao.setInsertData(free10)
                mFreeDataDao.setInsertData(free11)
                mFreeDataDao.setInsertData(free12)
                mFreeDataDao.setInsertData(free13)
                mFreeDataDao.setInsertData(free14)
                mFreeDataDao.setInsertData(free15)
                mFreeDataDao.setInsertData(free16)
                mFreeDataDao.setInsertData(free17)
                mFreeDataDao.setInsertData(free18)
                mFreeDataDao.setInsertData(free19)
                mFreeDataDao.setInsertData(free20)
                mFreeDataDao.setInsertData(free21)
                mFreeDataDao.setInsertData(free22)
                mFreeDataDao.setInsertData(free23)
                mFreeDataDao.setInsertData(free24)
                mFreeDataDao.setInsertData(free25)
                mFreeDataDao.setInsertData(free26)
                mFreeDataDao.setInsertData(free27)
                mFreeDataDao.setInsertData(free28)
                mFreeDataDao.setInsertData(free29)
                mFreeDataDao.setInsertData(free30)
                mFreeDataDao.setInsertData(free31)
                mFreeDataDao.setInsertData(free32)
                mFreeDataDao.setInsertData(free33)
                mFreeDataDao.setInsertData(free34)
                mFreeDataDao.setInsertData(free35)
                mFreeDataDao.setInsertData(free36)
                mFreeDataDao.setInsertData(free37)
                mFreeDataDao.setInsertData(free38)
                mFreeDataDao.setInsertData(free39)
                mFreeDataDao.setInsertData(free40)
                mFreeDataDao.setInsertData(free41)
                mFreeDataDao.setInsertData(free42)
                mFreeDataDao.setInsertData(free43)
                mFreeDataDao.setInsertData(free44)
                mFreeDataDao.setInsertData(free45)
                mFreeDataDao.setInsertData(free46)
                mFreeDataDao.setInsertData(free47)
                mFreeDataDao.setInsertData(free48)
                mFreeDataDao.setInsertData(free49)
                mFreeDataDao.setInsertData(free50)
                mFreeDataDao.setInsertData(free51)
                mFreeDataDao.setInsertData(free52)
                mFreeDataDao.setInsertData(free53)
                mFreeDataDao.setInsertData(free54)
                mFreeDataDao.setInsertData(free55)
                mFreeDataDao.setInsertData(free56)
                mFreeDataDao.setInsertData(free57)
                mFreeDataDao.setInsertData(free58)
                mFreeDataDao.setInsertData(free59)
                mFreeDataDao.setInsertData(free60)
                mFreeDataDao.setInsertData(free61)
                mFreeDataDao.setInsertData(free62)
                mFreeDataDao.setInsertData(free63)
                mFreeDataDao.setInsertData(free64)
                mFreeDataDao.setInsertData(free65)
                mFreeDataDao.setInsertData(free66)
                mFreeDataDao.setInsertData(free67)
                mFreeDataDao.setInsertData(free68)
                mFreeDataDao.setInsertData(free69)
                mFreeDataDao.setInsertData(free70)
                mFreeDataDao.setInsertData(free71)
                mFreeDataDao.setInsertData(free72)
                mFreeDataDao.setInsertData(free73)
                mFreeDataDao.setInsertData(free74)
                mFreeDataDao.setInsertData(free75)
                mFreeDataDao.setInsertData(free76)
                mFreeDataDao.setInsertData(free77)
                mFreeDataDao.setInsertData(free78)
                mFreeDataDao.setInsertData(free79)
                mFreeDataDao.setInsertData(free80)
                mFreeDataDao.setInsertData(free81)
                mFreeDataDao.setInsertData(free82)
                mFreeDataDao.setInsertData(free83)
                mFreeDataDao.setInsertData(free84)
                mFreeDataDao.setInsertData(free85)
                mFreeDataDao.setInsertData(free86)
                mFreeDataDao.setInsertData(free87)
                mFreeDataDao.setInsertData(free88)
                mFreeDataDao.setInsertData(free89)
                mFreeDataDao.setInsertData(free90)
                mFreeDataDao.setInsertData(free91)
                mFreeDataDao.setInsertData(free92)
                mFreeDataDao.setInsertData(free93)
                mFreeDataDao.setInsertData(free94)
                mFreeDataDao.setInsertData(free95)
                mFreeDataDao.setInsertData(free96)
                mFreeDataDao.setInsertData(free97)
                mFreeDataDao.setInsertData(free98)
                mFreeDataDao.setInsertData(free99)
                mFreeDataDao.setInsertData(free100)
            }
        }
    }
}