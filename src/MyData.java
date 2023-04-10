public class MyData<T> {                    //泛型用於類別宣告 T:Type E:Element K:Key V:Value
                                            //?:不確定的類別型態
    private T obj;                          //泛型用於變數宣告 屬性一律private

    public T getObj(){                      //泛型用於方法宣告
        return obj;
    }                                       //資料型態大寫開頭預設值都是null
    public void setObj(T obj){
        this.obj = obj;
    }


}
