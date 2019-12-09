package com.mungziapp.traveltogether.app;

import android.content.Context;

import com.mungziapp.traveltogether.R;
import com.mungziapp.traveltogether.data.TravelRoom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TravelHelper {
    public static HashMap<String, String> countryMap = new HashMap<>();
    private static TravelHelper instance = new TravelHelper();

    public static TravelHelper getInstance() { return instance; }

    private TravelHelper() {
        countryMap.put("알바니아", "\uD83C\uDDE6\uD83C\uDDF1");
        countryMap.put("아르메니아", "\uD83C\uDDE6\uD83C\uDDF2");
        countryMap.put("앙골라", "\uD83C\uDDE6\uD83C\uDDF4");
        countryMap.put("남극", "\uD83C\uDDE6\uD83C\uDDF6");
        countryMap.put("아르헨티나", "\uD83C\uDDE6\uD83C\uDDF7");
        countryMap.put("아메리칸사모아", "\uD83C\uDDE6\uD83C\uDDF8");
        countryMap.put("오스트리아", "\uD83C\uDDE6\uD83C\uDDF9");
        countryMap.put("호주", "\uD83C\uDDE6\uD83C\uDDFA");
        countryMap.put("아루바", "\uD83C\uDDE6\uD83C\uDDFC");
        countryMap.put("올란드제도", "\uD83C\uDDE6\uD83C\uDDFD");
        countryMap.put("아제르바이잔", "\uD83C\uDDE6\uD83C\uDDFF");
        countryMap.put("보스니아&헬제고비나", "\uD83C\uDDE7\uD83C\uDDE6");
        countryMap.put("바베이도스", "\uD83C\uDDE7\uD83C\uDDE7");
        countryMap.put("방글라데시", "\uD83C\uDDE7\uD83C\uDDE9");
        countryMap.put("벨기에", "\uD83C\uDDE7\uD83C\uDDEA");
        countryMap.put("부르키나파소", "\uD83C\uDDE7\uD83C\uDDEB");
        countryMap.put("불가리아", "\uD83C\uDDE7\uD83C\uDDEC");
        countryMap.put("바레인", "\uD83C\uDDE7\uD83C\uDDED");
        countryMap.put("부룬디", "\uD83C\uDDE7\uD83C\uDDEE");
        countryMap.put("베냉", "\uD83C\uDDE7\uD83C\uDDEF");
        countryMap.put("버뮤다", "\uD83C\uDDE7\uD83C\uDDF2");
        countryMap.put("브루나이", "\uD83C\uDDE7\uD83C\uDDF3");
        countryMap.put("볼리비아", "\uD83C\uDDE7\uD83C\uDDF4");
        countryMap.put("카리브해네덜란드", "\uD83C\uDDE7\uD83C\uDDF6");
        countryMap.put("브라질", "\uD83C\uDDE7\uD83C\uDDF7");
        countryMap.put("바하마", "\uD83C\uDDE7\uD83C\uDDF8");
        countryMap.put("부탄", "\uD83C\uDDE7\uD83C\uDDF9");
        countryMap.put("보츠와나", "\uD83C\uDDE7\uD83C\uDDFC");
        countryMap.put("벨로루시", "\uD83C\uDDE7\uD83C\uDDFE");
        countryMap.put("벨리즈", "\uD83C\uDDE7\uD83C\uDDFF");
        countryMap.put("캐나다", "\uD83C\uDDE8\uD83C\uDDE6");
        countryMap.put("코코스군도", "\uD83C\uDDE8\uD83C\uDDE8");
        countryMap.put("콩고민주공화국", "\uD83C\uDDE8\uD83C\uDDE9");
        countryMap.put("중앙아프리카공화국", "\uD83C\uDDE8\uD83C\uDDEB");
        countryMap.put("콩고-브라자빌", "\uD83C\uDDE8\uD83C\uDDEC");
        countryMap.put("스위스", "\uD83C\uDDE8\uD83C\uDDED");
        countryMap.put("코트디부아르", "\uD83C\uDDE8\uD83C\uDDEE");
        countryMap.put("쿡제도", "\uD83C\uDDE8\uD83C\uDDF0");
        countryMap.put("칠레", "\uD83C\uDDE8\uD83C\uDDF1");
        countryMap.put("카메룬", "\uD83C\uDDE8\uD83C\uDDF2");
        countryMap.put("중국", "\uD83C\uDDE8\uD83C\uDDF3");
        countryMap.put("콜롬비아", "\uD83C\uDDE8\uD83C\uDDF4");
        countryMap.put("코스타리카", "\uD83C\uDDE8\uD83C\uDDF7");
        countryMap.put("쿠바", "\uD83C\uDDE8\uD83C\uDDFA");
        countryMap.put("카보베르데", "\uD83C\uDDE8\uD83C\uDDFB");
        countryMap.put("크리스마스섬", "\uD83C\uDDE8\uD83C\uDDFD");
        countryMap.put("키프로스", "\uD83C\uDDE8\uD83C\uDDFE");
        countryMap.put("체코", "\uD83C\uDDE8\uD83C\uDDFF");
        countryMap.put("독일", "\uD83C\uDDE9\uD83C\uDDEA");
        countryMap.put("디에고가르시아", "\uD83C\uDDE9\uD83C\uDDEC");
        countryMap.put("지부티", "\uD83C\uDDE9\uD83C\uDDEF");
        countryMap.put("덴마크", "\uD83C\uDDE9\uD83C\uDDF0");
        countryMap.put("도미니카", "\uD83C\uDDE9\uD83C\uDDF2");
        countryMap.put("도미니카공화국", "\uD83C\uDDE9\uD83C\uDDF4");
        countryMap.put("알제리아", "\uD83C\uDDE9\uD83C\uDDFF");
        countryMap.put("세우타&멜리야", "\uD83C\uDDEA\uD83C\uDDE6");
        countryMap.put("에콰도르", "\uD83C\uDDEA\uD83C\uDDE8");
        countryMap.put("에스토니아", "\uD83C\uDDEA\uD83C\uDDEA");
        countryMap.put("이집트", "\uD83C\uDDEA\uD83C\uDDEC");
        countryMap.put("서사하라", "\uD83C\uDDEA\uD83C\uDDED");
        countryMap.put("에리트레아", "\uD83C\uDDEA\uD83C\uDDF7");
        countryMap.put("스페인", "\uD83C\uDDEA\uD83C\uDDF8");
        countryMap.put("이디오피아", "\uD83C\uDDEA\uD83C\uDDF9");
        countryMap.put("유럽 연합", "\uD83C\uDDEA\uD83C\uDDFA");
        countryMap.put("핀란드", "\uD83C\uDDEB\uD83C\uDDEE");
        countryMap.put("피지", "\uD83C\uDDEB\uD83C\uDDEF");
        countryMap.put("포클랜드 제도", "\uD83C\uDDEB\uD83C\uDDF0");
        countryMap.put("미크로네시아", "\uD83C\uDDEB\uD83C\uDDF2");
        countryMap.put("페로 제도", "\uD83C\uDDEB\uD83C\uDDF4");
        countryMap.put("프랑스", "\uD83C\uDDEB\uD83C\uDDF7");
        countryMap.put("가봉", "\uD83C\uDDEC\uD83C\uDDE6");
        countryMap.put("영국", "\uD83C\uDDEC\uD83C\uDDE7");
        countryMap.put("그레나다", "\uD83C\uDDEC\uD83C\uDDE9");
        countryMap.put("조지아", "\uD83C\uDDEC\uD83C\uDDEA");
        countryMap.put("프랑스령기아나", "\uD83C\uDDEC\uD83C\uDDEB");
        countryMap.put("건지 섬", "\uD83C\uDDEC\uD83C\uDDEC");
        countryMap.put("가나", "\uD83C\uDDEC\uD83C\uDDED");
        countryMap.put("지브롤터", "\uD83C\uDDEC\uD83C\uDDEE");
        countryMap.put("그린란드", "\uD83C\uDDEC\uD83C\uDDF1");
        countryMap.put("감비아", "\uD83C\uDDEC\uD83C\uDDF2");
        countryMap.put("기니", "\uD83C\uDDEC\uD83C\uDDF3");
        countryMap.put("과들루프", "\uD83C\uDDEC\uD83C\uDDF5");
        countryMap.put("적도기니", "\uD83C\uDDEC\uD83C\uDDF6");
        countryMap.put("그리스", "\uD83C\uDDEC\uD83C\uDDF7");
        countryMap.put("과테말라", "\uD83C\uDDEC\uD83C\uDDF9");
        countryMap.put("괌", "\uD83C\uDDEC\uD83C\uDDFA");
        countryMap.put("비사우", "\uD83C\uDDEC\uD83C\uDDFC");
        countryMap.put("가이아나", "\uD83C\uDDEC\uD83C\uDDFE");
        countryMap.put("홍콩", "\uD83C\uDDED\uD83C\uDDF0");
        countryMap.put("허드맥도날드제도", "\uD83C\uDDED\uD83C\uDDF2");
        countryMap.put("온두라스", "\uD83C\uDDED\uD83C\uDDF3");
        countryMap.put("크로아티아", "\uD83C\uDDED\uD83C\uDDF7");
        countryMap.put("아이티", "\uD83C\uDDED\uD83C\uDDF9");
        countryMap.put("헝가리", "\uD83C\uDDED\uD83C\uDDFA");
        countryMap.put("카나리아제도", "\uD83C\uDDEE\uD83C\uDDE8");
        countryMap.put("인도네시아", "\uD83C\uDDEE\uD83C\uDDE9");
        countryMap.put("아일랜드", "\uD83C\uDDEE\uD83C\uDDEA");
        countryMap.put("이스라엘", "\uD83C\uDDEE\uD83C\uDDF1");
        countryMap.put("맨섬", "\uD83C\uDDEE\uD83C\uDDF2");
        countryMap.put("인도", "\uD83C\uDDEE\uD83C\uDDF3");
        countryMap.put("영국령 인도양 영토", "\uD83C\uDDEE\uD83C\uDDF4");
        countryMap.put("이라크", "\uD83C\uDDEE\uD83C\uDDF6");
        countryMap.put("이란", "\uD83C\uDDEE\uD83C\uDDF7");
        countryMap.put("아이슬란드", "\uD83C\uDDEE\uD83C\uDDF8");
        countryMap.put("이탈리아", "\uD83C\uDDEE\uD83C\uDDF9");
        countryMap.put("저지", "\uD83C\uDDEF\uD83C\uDDEA");
        countryMap.put("자메이카", "\uD83C\uDDEF\uD83C\uDDF2");
        countryMap.put("요르단", "\uD83C\uDDEF\uD83C\uDDF4");
        countryMap.put("일본", "\uD83C\uDDEF\uD83C\uDDF5");
        countryMap.put("케냐", "\uD83C\uDDF0\uD83C\uDDEA");
        countryMap.put("키르기즈스탄", "\uD83C\uDDF0\uD83C\uDDEC");
        countryMap.put("캄보디아", "\uD83C\uDDF0\uD83C\uDDED");
        countryMap.put("키리바시", "\uD83C\uDDF0\uD83C\uDDEE");
        countryMap.put("코모로", "\uD83C\uDDF0\uD83C\uDDF2");
        countryMap.put("세인트 키츠 네비스", "\uD83C\uDDF0\uD83C\uDDF3");
        countryMap.put("북한", "\uD83C\uDDF0\uD83C\uDDF5");
        countryMap.put("대한민국", "\uD83C\uDDF0\uD83C\uDDF7");
        countryMap.put("쿠웨이트", "\uD83C\uDDF0\uD83C\uDDFC");
        countryMap.put("케이맨 제도", "\uD83C\uDDF0\uD83C\uDDFE");
        countryMap.put("카자흐스탄", "\uD83C\uDDF0\uD83C\uDDFF");
        countryMap.put("라오스", "\uD83C\uDDF1\uD83C\uDDE6");
        countryMap.put("레바논", "\uD83C\uDDF1\uD83C\uDDE7");
        countryMap.put("세인트 루시아", "\uD83C\uDDF1\uD83C\uDDE8");
        countryMap.put("리히텐슈타인", "\uD83C\uDDF1\uD83C\uDDEE");
        countryMap.put("스리랑카", "\uD83C\uDDF1\uD83C\uDDF0");
        countryMap.put("라이베리아", "\uD83C\uDDF7");
        countryMap.put("레소토", "\uD83C\uDDF1\uD83C\uDDF8");
        countryMap.put("리투아니아", "\uD83C\uDDF1\uD83C\uDDF9");
        countryMap.put("룩셈부르크", "\uD83C\uDDF1\uD83C\uDDFA");
        countryMap.put("라트비아", "\uD83C\uDDF1\uD83C\uDDFB");
        countryMap.put("리비아", "\uD83C\uDDF1\uD83C\uDDFE");
        countryMap.put("모로코", "\uD83C\uDDF2\uD83C\uDDE6");
        countryMap.put("모나코", "\uD83C\uDDF2\uD83C\uDDE8");
        countryMap.put("몰도바", "\uD83C\uDDF2\uD83C\uDDE9");
        countryMap.put("몬테네그로", "\uD83C\uDDF2\uD83C\uDDEA");
        countryMap.put("세인트 마틴", "\uD83C\uDDF2\uD83C\uDDEB");
        countryMap.put("마다가스카르", "\uD83C\uDDF2\uD83C\uDDEC");
        countryMap.put("마샬 군도", "\uD83C\uDDF2\uD83C\uDDED");
        countryMap.put("북 마케도니아", "\uD83C\uDDF2\uD83C\uDDF0");
        countryMap.put("말리", "\uD83C\uDDF2\uD83C\uDDF1");
        countryMap.put("미얀마", "\uD83C\uDDF2\uD83C\uDDF2");
        countryMap.put("몽골", "\uD83C\uDDF2\uD83C\uDDF3");
        countryMap.put("북 마리아나 군도", "\uD83C\uDDF2\uD83C\uDDF5");
        countryMap.put("마르티니크", "\uD83C\uDDF2\uD83C\uDDF6");
        countryMap.put("모리타니", "\uD83C\uDDF2\uD83C\uDDF7");
        countryMap.put("몬트 세 라트", "\uD83C\uDDF2\uD83C\uDDF8");
        countryMap.put("말타", "\uD83C\uDDF2\uD83C\uDDF9");
        countryMap.put("모리셔스", "\uD83C\uDDF2\uD83C\uDDFA");
        countryMap.put("몰디브", "\uD83C\uDDF2\uD83C\uDDFB");
        countryMap.put("말라위", "\uD83C\uDDF2\uD83C\uDDFC");
        countryMap.put("멕시코", "\uD83C\uDDF2\uD83C\uDDFD");
        countryMap.put("말레이시아", "\uD83C\uDDF2\uD83C\uDDFE");
        countryMap.put("모잠비크", "\uD83C\uDDF2\uD83C\uDDFF");
        countryMap.put("나미비아", "\uD83C\uDDF3\uD83C\uDDE6");
        countryMap.put("뉴 칼레도니아", "\uD83C\uDDF3\uD83C\uDDE8");
        countryMap.put("니제르", "\uD83C\uDDF3\uD83C\uDDEA");
        countryMap.put("노퍽 섬", "\uD83C\uDDF3\uD83C\uDDEB");
        countryMap.put("나이지리아", "\uD83C\uDDF3\uD83C\uDDEC");
        countryMap.put("니카라구아", "\uD83C\uDDF3\uD83C\uDDEE");
        countryMap.put("네덜란드", "\uD83C\uDDF3\uD83C\uDDF1");
        countryMap.put("노르웨이", "\uD83C\uDDF3\uD83C\uDDF4");
        countryMap.put("네팔", "\uD83C\uDDF3\uD83C\uDDF5");
        countryMap.put("나우루", "\uD83C\uDDF3\uD83C\uDDF7");
        countryMap.put("니우에", "\uD83C\uDDF3\uD83C\uDDFA");
        countryMap.put("뉴질랜드", "\uD83C\uDDF3\uD83C\uDDFF");
        countryMap.put("오만", "\uD83C\uDDF4\uD83C\uDDF2");
        countryMap.put("파나마", "\uD83C\uDDF5\uD83C\uDDE6");
        countryMap.put("페루", "\uD83C\uDDF5\uD83C\uDDEA");
        countryMap.put("프랑스 령 폴리네시아", "\uD83C\uDDF5\uD83C\uDDEB");
        countryMap.put("파푸아 뉴기니", "\uD83C\uDDF5\uD83C\uDDEC");
        countryMap.put("필리핀", "\uD83C\uDDF5\uD83C\uDDED");
        countryMap.put("파키스탄", "\uD83C\uDDF5\uD83C\uDDF0");
        countryMap.put("폴란드", "\uD83C\uDDF5\uD83C\uDDF1");
        countryMap.put("핏 케언 제도", "\uD83C\uDDF5\uD83C\uDDF3");
        countryMap.put("푸에르토 리코", "\uD83C\uDDF5\uD83C\uDDF7");
        countryMap.put("팔레스타인 영토", "\uD83C\uDDF5\uD83C\uDDF8");
        countryMap.put("포르투갈", "\uD83C\uDDF5\uD83C\uDDF9");
        countryMap.put("팔라우", "\uD83C\uDDF5\uD83C\uDDFC");
        countryMap.put("파라과이", "\uD83C\uDDF5\uD83C\uDDFE");
        countryMap.put("카타르", "\uD83C\uDDF6\uD83C\uDDE6");
        countryMap.put("레위니옹", "\uD83C\uDDF7\uD83C\uDDEA");
        countryMap.put("루마니아", "\uD83C\uDDF7\uD83C\uDDF4");
        countryMap.put("세르비아", "\uD83C\uDDF7\uD83C\uDDF8");
        countryMap.put("러시아", "\uD83C\uDDF7\uD83C\uDDFA");
        countryMap.put("르완다", "\uD83C\uDDF7\uD83C\uDDFC");
        countryMap.put("사우디 아라비아", "\uD83C\uDDF8\uD83C\uDDE6");
        countryMap.put("솔로몬 제도", "\uD83C\uDDF8\uD83C\uDDE7");
        countryMap.put("세이셸", "\uD83C\uDDF8\uD83C\uDDE8");
        countryMap.put("수단", "\uD83C\uDDF8\uD83C\uDDE9");
        countryMap.put("스웨덴", "\uD83C\uDDF8\uD83C\uDDEA");
        countryMap.put("싱가포르", "\uD83C\uDDF8\uD83C\uDDEC");
        countryMap.put("슬로베니아", "\uD83C\uDDF8\uD83C\uDDEE");
        countryMap.put("슬로바키아", "\uD83C\uDDF8\uD83C\uDDF0");
        countryMap.put("시에라 리온", "\uD83C\uDDF8\uD83C\uDDF1");
        countryMap.put("세네갈", "\uD83C\uDDF8\uD83C\uDDF3");
        countryMap.put("소말리아", "\uD83C\uDDF8\uD83C\uDDF4");
        countryMap.put("수리남", "\uD83C\uDDF8\uD83C\uDDF7");
        countryMap.put("남 수단", "\uD83C\uDDF8\uD83C\uDDF8");
        countryMap.put("엘살바도르", "\uD83C\uDDF8\uD83C\uDDFB");
        countryMap.put("시리아", "\uD83C\uDDF8\uD83C\uDDFE");
        countryMap.put("스와질란드", "\uD83C\uDDF8\uD83C\uDDFF");
        countryMap.put("투르크 & 카이 코스 군도", "\uD83C\uDDF9\uD83C\uDDE8");
        countryMap.put("차드", "\uD83C\uDDF9\uD83C\uDDE9");
        countryMap.put("프랑스 남부 영토", "\uD83C\uDDF9\uD83C\uDDEB");
        countryMap.put("토고", "\uD83C\uDDF9\uD83C\uDDEC");
        countryMap.put("태국", "\uD83C\uDDF9\uD83C\uDDED");
        countryMap.put("타지키스탄", "\uD83C\uDDF9\uD83C\uDDEF");
        countryMap.put("토켈 라우", "\uD83C\uDDF9\uD83C\uDDF0");
        countryMap.put("동 티모르", "\uD83C\uDDF9\uD83C\uDDF1");
        countryMap.put("투르크 메니스탄", "\uD83C\uDDF9\uD83C\uDDF2");
        countryMap.put("튀니지", "\uD83C\uDDF9\uD83C\uDDF3");
        countryMap.put("통가", "\uD83C\uDDF9\uD83C\uDDF4");
        countryMap.put("터키", "\uD83C\uDDF9\uD83C\uDDF7");
        countryMap.put("트리니다드 토바고", "\uD83C\uDDF9\uD83C\uDDF9");
        countryMap.put("투발루", "\uD83C\uDDF9\uD83C\uDDFB");
        countryMap.put("대만", "\uD83C\uDDF9\uD83C\uDDFC");
        countryMap.put("탄자니아", "\uD83C\uDDF9\uD83C\uDDFF");
        countryMap.put("우크라이나", "\uD83C\uDDFA\uD83C\uDDE6");
        countryMap.put("우간다", "\uD83C\uDDFA\uD83C\uDDEC");
        countryMap.put("유엔", "\uD83C\uDDFA\uD83C\uDDF3");
        countryMap.put("미국", "\uD83C\uDDFA\uD83C\uDDF8");
        countryMap.put("우루과이", "\uD83C\uDDFA\uD83C\uDDFE");
        countryMap.put("우즈베키스탄", "\uD83C\uDDFA\uD83C\uDDFF");
        countryMap.put("바티칸 시티", "\uD83C\uDDFB\uD83C\uDDE6");
        countryMap.put("베네수엘라", "\uD83C\uDDFB\uD83C\uDDEA");
        countryMap.put("영국령 버진 아일랜드", "\uD83C\uDDFB\uD83C\uDDEC");
        countryMap.put("미국령 버진 아일랜드", "\uD83C\uDDFB\uD83C\uDDEE");
        countryMap.put("베트남", "\uD83C\uDDFB\uD83C\uDDF3");
        countryMap.put("바누아투", "\uD83C\uDDFB\uD83C\uDDFA");
        countryMap.put("사모아", "\uD83C\uDDFC\uD83C\uDDF8");
        countryMap.put("코소보", "\uD83C\uDDFD\uD83C\uDDF0");
        countryMap.put("예멘", "\uD83C\uDDFE\uD83C\uDDEA");
        countryMap.put("남아프리카", "\uD83C\uDDFF\uD83C\uDDE6");
        countryMap.put("잠비아", "\uD83C\uDDFF\uD83C\uDDF2");
        countryMap.put("짐바브웨", "\uD83C\uDDFF\uD83C\uDDFC");
        countryMap.put("스코틀란드", "\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC73\uDB40\uDC63\uDB40\uDC74\uDB40\uDC7F");
        countryMap.put("웨일즈", "\uD83C\uDFF4\uDB40\uDC67\uDB40\uDC62\uDB40\uDC77\uDB40\uDC6C\uDB40\uDC73\uDB40\uDC7F");
        countryMap.put("안도라", "\uD83C\uDDE6\uD83C\uDDE9");
        countryMap.put("아랍에미리트", "\uD83C\uDDE6\uD83C\uDDEA");
        countryMap.put("아프가니스탄", "\uD83C\uDDE6\uD83C\uDDEB");
        countryMap.put("앤티가바부다", "\uD83C\uDDE6\uD83C\uDDEC");
        countryMap.put("앵귈라", "\uD83C\uDDE6\uD83C\uDDEE");
    }

    public static void init(Context context) {
        DatabaseManager.openDatabase(context);
        //DatabaseManager.dropTables();
        DatabaseManager.createTables();
        DatabaseManager.insertDummyData(makeTravelRoom());
    }

    private static List<TravelRoom> makeTravelRoom() {
        String countries = "\uD83C\uDDF0\uD83C\uDDF7,\uD83C\uDDFA\uD83C\uDDF8,\uD83C\uDDED\uD83C\uDDF0,\uD83C\uDDEB\uD83C\uDDF7" +
                ",\uD83C\uDDEC\uD83C\uDDFA,\uD83C\uDDFB\uD83C\uDDF3,\uD83C\uDDF2\uD83C\uDDF4,\uD83C\uDDF3\uD83C\uDDF5" +
                ",\uD83C\uDDEC\uD83C\uDDF9,\uD83C\uDDEC\uD83C\uDDE9,\uD83C\uDDEC\uD83C\uDDF7,\uD83C\uDDEC\uD83C\uDDF1";
        String countries2 = "";
        String countries3 = "\uD83C\uDDF7\uD83C\uDDFA";

        int members = 9;
        int members2 = 1;
        int members3 = 2;

        List<TravelRoom> travelRooms = new ArrayList<>();
        travelRooms.add(new TravelRoom(1, "엄마와 함께하는 4박 5일 홍콩여행", "20.01.12","20.01.16", countries, R.drawable.travel_room_sample_01, members));
        travelRooms.add(new TravelRoom(2, "친구들과 처음가는 배낭 여행", "2019.12.09", "19.12.29", countries2, R.drawable.travel_room_sample_02, members2));
        travelRooms.add(new TravelRoom(3, "마카오로 호캉스~~!!", "19.10.11", "19.10.15", countries3, R.drawable.travel_room_sample_03, members3));
        travelRooms.add(new TravelRoom(4, "앗싸 퇴직여행 ✈️", "19.08.15", "19.08.18", countries, R.drawable.travel_room_sample_04, members));
        travelRooms.add(new TravelRoom(5, "혼자가는 러시아 일주 \uD83C\uDFA1", "19.07.12", "19.07.16", countries2, R.drawable.travel_room_sample_01, members2));
        travelRooms.add(new TravelRoom(6, "찐친들 - 미국 횡단 일주", "19.06.09", "19.06.29", countries3, R.drawable.travel_room_sample_02, members3));

        travelRooms.add(new TravelRoom(7, "가치 같이 여행", "18.10.12", "18.10.16", countries2, R.drawable.travel_room_sample_05, members2));
        travelRooms.add(new TravelRoom(8, "일주일 제주 여행", "18.06.09", "19.06.29", countries3, R.drawable.travel_room_sample_06, members3));
        travelRooms.add(new TravelRoom(9, "내일로 전국 일주~~", "18.02.11", "18.02.15", countries, R.drawable.travel_room_sample_07, members));
        travelRooms.add(new TravelRoom(10, "가자 파리로~!", "17.12.15", "17.12.28", countries2, R.drawable.travel_room_sample_01, members2));
        travelRooms.add(new TravelRoom(11, "얄리얄리얄라셩 얄라리얄라", "17.10.12", "17.10.16", countries3, R.drawable.travel_room_sample_05, members3));
        travelRooms.add(new TravelRoom(12, "일주일 제주 여행", "17.06.09", "17.06.29", countries, R.drawable.travel_room_sample_06, members));
        travelRooms.add(new TravelRoom(13, "내일로 전국 일주~~", "17.02.11", "17.02.15", countries2, R.drawable.travel_room_sample_07, members2));
        travelRooms.add(new TravelRoom(14, "가자 파리로~!", "16.08.19", "16.09.02", countries3, R.drawable.travel_room_sample_01, members3));

        return travelRooms;
    }
}
