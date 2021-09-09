# SharedPreferences
안드로이드 플랫폼은 가단한 데이터의 저장을 목적으로 SharedPreferences를 제공합니다. SharedPreferences는 내부저장소를 이용하기 때문에 권한 설정이 필요 없고 훨씬 간단한 코드로 사용가능.
주로 로그인 정보나 앱의 상태 정보를 저장하는 용도로 사용되고 액티비티에서 인텐트에 값을 넣고 빼는 것과 비슷한 형태로 동작합니다.
SharedPreferences는 인텐트에 값을 전달하듯이 데이터를 키와 값 쌍으로 저장할 수 있습니다. 데이터는 XML형식으로 된 파일로 저장되며 앱이 종료되어도 남아 있습니다.
값을 저장하기 위해서는 마지막에 꼭 apply()를 해줘야 하지만 읽어올 때는 필요하지 않습니다.


설정 값 사용하기.PreferenceScreen에서 값을 조절하면 설정값이 자동으로 지정된 SharedPreferences파일에 저장됩니다.
해당파일은 PreferenceManager.getDefaultSharedPreferences()메서드를 호출해서 사용 할 수 있습니다.
사용법은 일반적인 SharedPreferences를 사용하는 방법과 동일합니다.

val shared = PreferenceManager.getDefaultSharedPreferences(this)

val checkeboxValue = shared.getBoolean("key_add_shortcut",false)
val switchValue = shared.getBoolean("key_switch_on",false)
val name = shared.getString("key_edit_name","")
val selected = shared.getString("key_set_item","")

CheckBoxPreference와 SwitchPreference는 저장값이 참과 거짓인 Boolean 타입이기 때문에 getBoolean()메서드로 사용할 수 있고 EditPreference와 ListPreference는 입력된 값과 선택된 값 모두
getString()메서드로 사용가능.

출처: 이것이 안드로이드다 with 코틀린,고돈호 지음, 한빛 미디어
