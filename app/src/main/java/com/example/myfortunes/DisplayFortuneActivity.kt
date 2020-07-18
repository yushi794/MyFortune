package com.example.myfortunes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class DisplayFortuneActivity : AppCompatActivity() {
    private var name: String = ""
    private var description: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_fortune)

        // Get the Intent that started this activity and extract the string
        val messageName = intent.getStringExtra(EXTRA_MESSAGE)

        // Capture the layout's TextView and set the string as its text
        val nameView = findViewById<TextView>(R.id.nameView).apply {
            text = """${messageName}さんの
            """
        }
        //
        fortune()

        //
        val todayFortune = findViewById<TextView>(R.id.todayFortuneView).apply {
                text = name
        }
        //
        val todayFortuneComment = findViewById<TextView>(R.id.todayFortuneCommentView).apply {
                text = description
         }
    }

    fun fortune() {
        val fortuneList = arrayOf("大吉", "吉", "中吉", "小吉", "末吉", "凶", "大凶")
        val descList = arrayOf(
            "今日のあなたは無敵!!何しても許されるレベル!!",
            "今日はツイてるはず!!だけど調子には乗りすぎないで!!",
            "あなたに運も味方してくれるはず!!きっとだけど...",
            "まさに普通!!普通が一番だよきっと...",
            "ツイてない一日かもしれないけど、頑張ってほしい...",
            "何やっても裏目にでる日!!大丈夫明日があるさ!!",
            "最悪な一日!!まずは生きていることに感謝しよう!!"
        )
        getFortune(fortuneList,descList)

    }

    fun getFortune(fortuneList:Array<String>,descList:Array<String>) {
        val index = Random().nextInt(fortuneList.size)
        this.name = fortuneList[index]
        this.description = descList[index]
    }

}