
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-KatexMathView-yellow.svg?style=flat)](https://android-arsenal.com/details/1/5577)
![Stable](https://img.shields.io/badge/version-1.0.1-brightgreen.svg?style=flat)

  A [KhanAcademy Katex](https://khan.github.io/KaTeX/) based Library for Rendering math faster in various Android Devices.
  This a View which is created from extending webview. This view allows you to render latex in your android devices. It can load
  normal text, text with latex and latex alone. The only thing you have to make sure is your latex should be enclosed inside
  either $your latex formula$ or $$your latex formula$$. This will also allow you to beautify your formula text by setting color 
  and text size. 
  
  ---



### Accepted Inputs
    $x=\frac{1+y}{1+2z^2}$
    
or 
    
     $$x=\frac{1+y}{1+2z^2}$$
or

     sum of ratios =4+3=7 $=\frac{4}{7}\times560=320$
or

     Data Included inside HTML TAGS
     
     <p>If <span class="latexEle" data-latex="x:35::48:60">$x:35::48:60$</span><span>  </span>, find the value of <span class="latexEle" data-latex="x">$x$</span><span>  </span>.</p>

### Setup

    Dependencies
    {
      implementation 'in.hourglass.mathrender:katexmathview:1.0.1'
    }
    
### Attributes supported

     setTextColor          -> Allows you to beautify your latex with specific color of your choice
     setTextSize           -> Allows you to set text size of the latex displayed on screen
     setViewBackgroudColor -> set the background color of the view.
     setClickable  
       i.True     -> Setting this to true will allow KatexMathview to act as Textview and it will also intercept parent layout touchevent useful to register click 
       when this view is used with List,Recyclerview.
       ii.False   -> Setting this to false will make katexMathvview act as an webview with zoom in controls etc. 
       
       
    
### Adding to your XML Layout
   
        <katex.hourglass.in.mathlib.MathView
          app:setTextColor="@color/primary"
          app:setTextSize="14sp"
          app:setClickable="true"
          app:setText="@string/single_formula"
          android:layout_gravity="center"
          android:layout_width="match_parent"
          android:layout_height="wrap_content" />
        
        
### Adding at runtime
       
        MathView mathView = new MathView(getApplicationContext());
        mathView.setClickable(true);
        mathView.setTextSize(14);
        mathView.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.white));
        mathView.setDisplayText(getResources().getString(R.string.runtime_formula));
        mathView.setViewBackgroundColor(ContextCompat.getColor(getApplicationContext(),android.R.color.black));
        parent_layout.addView(mathView);
       


### Demo
   ![demo_katex_list_200](https://cloud.githubusercontent.com/assets/8025146/24969740/628856d2-1fcf-11e7-9daf-01e7fd5452db.gif) ![demo_katex_layout_200](https://cloud.githubusercontent.com/assets/8025146/24969771/825f161c-1fcf-11e7-8955-945a363404b0.gif) ![demo_katex_runtime_200](https://cloud.githubusercontent.com/assets/8025146/24969808/a3a42e3e-1fcf-11e7-83b5-beb802b700e8.gif)

Sample code is available under the app module, in this same repo

##### Find this project useful? Send me a cup of coffee!

  * <a href="https://www.paypal.me/Lingarajs/5" target="_blank"><img src="https://www.paypalobjects.com/webstatic/en_US/i/buttons/PP_logo_h_200x51.png" alt="PayPal.me/Lingarajs" style="width: 30px;"></a>

---
  
# License

     The MIT License (MIT)

     Copyright (c) 2017 Lingaraj Sankaravelu

     Permission is hereby granted, free of charge, to any person obtaining a copy
     of this software and associated documentation files (the "Software"), to deal
     in the Software without restriction, including without limitation the rights
     to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
     copies of the Software, and to permit persons to whom the Software is
     furnished to do so, subject to the following conditions:

     The above copyright notice and this permission notice shall be included in all
     copies or substantial portions of the Software.

     THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
     IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
     FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
     AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
     LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
     OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
     SOFTWARE.


