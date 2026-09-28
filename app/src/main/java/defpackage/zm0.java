package defpackage;

import android.R;
import android.text.Html;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.f;
import com.v2ray.ang.util.MainActivityWifi;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zm0 implements View.OnClickListener {
    public final /* synthetic */ int a = 2;
    public Object b;
    public final /* synthetic */ Object c;

    public zm0(ToolbarWidgetWrapper toolbarWidgetWrapper) {
        this.c = toolbarWidgetWrapper;
        this.b = new ActionMenuItem(toolbarWidgetWrapper.a.getContext(), 0, R.id.home, 0, 0, toolbarWidgetWrapper.j);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((MainActivityWifi) obj);
                this.b = alertDialog$Builder;
                alertDialog$Builder.a.e = Html.fromHtml("Cách Phát Wifi Qua Proxy");
                ((AlertDialog$Builder) this.b).a.g = Html.fromHtml("</strong> 1. Kết Nối VPN ,Chọn Mục Phát Wifi ( Proxy ) Trên Ứng Dụng<br>2. Kích Hoạt Phát Wifi Trên Máy Hoặc Điểm Phát Sóng <br>3. Bạn Nhập Cổng Như Sau :<br>Đối Với AZZPHUC PRO ( SSH) Là <font color=#f70217>1080 , 8080</font> \nĐối Với V2Ray , V2FlyNG Là <font color=#f70217>10809</font><br>4. Bấm Bắt Đầu , Yêu Cầu Đã Kết Nối 4G VPN , Đã Bật Phát Wifi Bạn Sẽ Thấy Dòng <font color=#f70217>192.168.xx.x</font>: Cổng Đã Nhập)<br>5. Trên Máy Bắt Các Bạn Kết Nối Wifi Đó , Chọn Mục Proxy ( Ở Trạng Thái Không Có ) , Chọn Thủ Công<br>6. Nhập IP <font color=#f70217>192.x.x.x</font> ( Tên Máy Chủ , Server) , Nhập Cổng Sau Đó Lưu Và Kết Nối Lại Wifi<br>7. Nếu <font color=#f70217>Lỗi</font> , Cổng Bận Bạn Hãy Buộc Dừng App . Chúc Các Bạn Thành Công</strong>");
                ((AlertDialog$Builder) this.b).e(Html.fromHtml("Đồng Ý"), null);
                ((AlertDialog$Builder) this.b).a().show();
                break;
            case 1:
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                int iO0 = ((LinearLayoutManager) materialCalendar.h0.getLayoutManager()).O0() - 1;
                if (iO0 >= 0) {
                    Calendar calendarD = ol1.d(((f) this.b).d.a.a);
                    calendarD.add(2, iO0);
                    materialCalendar.X(new er0(calendarD));
                }
                break;
            default:
                ToolbarWidgetWrapper toolbarWidgetWrapper = (ToolbarWidgetWrapper) obj;
                Window.Callback callback = toolbarWidgetWrapper.m;
                if (callback != null && toolbarWidgetWrapper.n) {
                    callback.onMenuItemSelected(0, (ActionMenuItem) this.b);
                    break;
                }
                break;
        }
    }

    public zm0(MainActivityWifi mainActivityWifi) {
        this.c = mainActivityWifi;
    }

    public zm0(MaterialCalendar materialCalendar, f fVar) {
        this.c = materialCalendar;
        this.b = fVar;
    }
}
