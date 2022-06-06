package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.step1.*
import com.example.myapplication.step2.*
import com.example.myapplication.step3.ExtFuncTest
import com.example.myapplication.step3.LambdasTest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doTest(FirstTest(::WriteLn))
        doTest(DataTest(::WriteLn))
        doTest(StringTest(::WriteLn))
        doTest(AnyTypeTest(::WriteLn))
        doTest(FunctionTest(::WriteLn))
        doTest(ConditionTest(::WriteLn))
        doTest(LabelTest(::WriteLn))
        doTest(CollectionsTest(::WriteLn))
        doTest(ExceptionTest(::WriteLn))
        doTest(ClassTest(::WriteLn))
        doTest(PolymorphTest(::WriteLn))
        doTest(InterAbstractTest(::WriteLn))
        doTest(DataClassTest(::WriteLn))
        doTest(ObjectTest(::WriteLn))
        doTest(LambdasTest(::WriteLn))
        doTest(ExtFuncTest(::WriteLn))
    }

    private fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn( any : Any) {
//        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }
}