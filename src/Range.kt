fun main() {
    // Range normal
    val Range = 1..100;
    println(Range)
    println(Range.count());
    println(Range.contains(10));
    println(Range.contains(120));
    println(Range.first);
    println(Range.last);
    println(Range.step);

    // operasi range
    // count() = total data range
    // countains(value) = filter value pada Variabel Range
    // first = untuk mengambil nilai awal
    // last = untuk mengambil nilai akhir
    // step = untuk mendapatkan nilai kenaikannya

    // Range Terbalik
    val RangeUpNormal = 1 downTo 100
    println(RangeUpNormal)
    println(RangeUpNormal.count());
    println(RangeUpNormal.contains(10));
    println(RangeUpNormal.contains(120));
    println(RangeUpNormal.first);
    println(RangeUpNormal.last);
    println(RangeUpNormal.step);

    // Range Dengan Step
    val range = 100 downTo 1 step 2
    println(range)
    println(range.count());
    println(range.contains(10));
    println(range.contains(120));
    println(range.first);
    println(range.last);
    println(range.step);


}