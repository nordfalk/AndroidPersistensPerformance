# AndroidDBMSPerformanceBenchmark
This repository contains implementations of popular Android database management systems along with performance tests (benchmarking) for each of them..

Check the benchmark results [here](https://medium.com/@luka.leopoldovic/android-dbms-performance-comparison-using-the-jetpack-benchmark-library-19581bf67443). <br/>
For detailed results (all statistical parameters obtained), check this [sheet](https://docs.google.com/spreadsheets/d/1dBUTe_wXP_-lZSE6Eq7I3fjty9p__TpZxfqRbmE_-Uk/edit#gid=1817884782).

./gradlew benchmark:connectedCheck




benchmark:     1,917,550 ns EMULATOR_UNLOCKED_DBFlowBenchmark.benchmark_delete
                    "median": 2626640,


benchmark:     6,356,670 ns EMULATOR_UNLOCKED_DBFlowBenchmark.benchmark_insert
                    "median": 8509290,


benchmark:     6,090,460 ns EMULATOR_UNLOCKED_DBFlowBenchmark.benchmark_update
                    "median": 7287055,


benchmark:       459,610 ns EMULATOR_UNLOCKED_DBFlowBenchmark.benchmark_read
                    "median": 500095,


benchmark:        40,580 ns EMULATOR_UNLOCKED_JavaSerialiseringBenchmark.benchmark_delete
benchmark:     1,564,860 ns EMULATOR_UNLOCKED_JavaSerialiseringBenchmark.benchmark_insert
benchmark:     1,551,880 ns EMULATOR_UNLOCKED_JavaSerialiseringBenchmark.benchmark_update
benchmark:     3,403,790 ns EMULATOR_UNLOCKED_JavaSerialiseringBenchmark.benchmark_read
benchmark:       362,360 ns EMULATOR_UNLOCKED_RealmBenchmark.benchmark_delete
benchmark:       873,140 ns EMULATOR_UNLOCKED_RealmBenchmark.benchmark_insert
benchmark:       680,900 ns EMULATOR_UNLOCKED_RealmBenchmark.benchmark_update
benchmark:        15,986 ns EMULATOR_UNLOCKED_RealmBenchmark.benchmark_read
benchmark:       159,870 ns EMULATOR_UNLOCKED_RoomBenchmark.benchmark_delete
benchmark:     4,285,360 ns EMULATOR_UNLOCKED_RoomBenchmark.benchmark_insert
benchmark:     5,010,390 ns EMULATOR_UNLOCKED_RoomBenchmark.benchmark_update
benchmark:       424,260 ns EMULATOR_UNLOCKED_RoomBenchmark.benchmark_read
benchmark:     2,156,540 ns EMULATOR_UNLOCKED_SQLiteBenchmark.benchmark_delete
benchmark:     8,220,940 ns EMULATOR_UNLOCKED_SQLiteBenchmark.benchmark_insert
benchmark:     5,775,060 ns EMULATOR_UNLOCKED_SQLiteBenchmark.benchmark_update
benchmark:     1,099,360 ns EMULATOR_UNLOCKED_SQLiteBenchmark.benchmark_read
