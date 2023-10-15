// Generated by jextract

package c.lib.math;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * union __mingw_flt_type_t {
 *     float x;
 *     unsigned int val;
 * };
 * }
 */
public class __mingw_flt_type_t {

    public static MemoryLayout $LAYOUT() {
        return constants$5.const$1;
    }
    public static VarHandle x$VH() {
        return constants$5.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * float x;
     * }
     */
    public static float x$get(MemorySegment seg) {
        return (float)constants$5.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * float x;
     * }
     */
    public static void x$set(MemorySegment seg, float x) {
        constants$5.const$2.set(seg, x);
    }
    public static float x$get(MemorySegment seg, long index) {
        return (float)constants$5.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, float x) {
        constants$5.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle val$VH() {
        return constants$5.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int val;
     * }
     */
    public static int val$get(MemorySegment seg) {
        return (int)constants$5.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int val;
     * }
     */
    public static void val$set(MemorySegment seg, int x) {
        constants$5.const$3.set(seg, x);
    }
    public static int val$get(MemorySegment seg, long index) {
        return (int)constants$5.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void val$set(MemorySegment seg, long index, int x) {
        constants$5.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena arena) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, arena); }
}


