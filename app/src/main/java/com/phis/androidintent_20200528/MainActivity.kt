package com.phis.androidintent_20200528

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()
            Log.d("입력받은 폰번호", phoneNum)

            val myUri = Uri.parse("tel:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)
        }

        callBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()
            Log.d("입력받은 폰번호", phoneNum)

            val myUri = Uri.parse("tel:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)

            //권한 얻는 작업을 하지 않았기때문에 에러로 표시가 되고, 실제 기능 실행시 앱오류가 발생한다.
            startActivity(myIntent)


        }


        smsBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()
            Log.d("입력받은 폰번호", phoneNum)

            val myUri = Uri.parse("smsto:${phoneNum}")
            val myIntent = Intent(Intent.ACTION_SENDTO, myUri)
            myIntent.putExtra("sms_body","미리 적어둘 내용")

            startActivity(myIntent)

        }

        webBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()
            val myUri = Uri.parse("https://naver.com")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)

            startActivity(myIntent)

        }

        playStoreBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()
            val myUri = Uri.parse("market://details?id=com.kakao.talk&hl=ko")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)

            startActivity(myIntent)

        }



    }
}
