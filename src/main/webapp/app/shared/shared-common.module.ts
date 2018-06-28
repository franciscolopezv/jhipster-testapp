import { NgModule } from '@angular/core';

import { TestwebappSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [TestwebappSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [TestwebappSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TestwebappSharedCommonModule {}
