package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ClassificacaoFiscalOperacao extends AbstractSankhyaEntity<ClassificacaoFiscalOperacao> {
   public String getCalcDifIcms() {
        return this.getVo().asString("CALCDIFICMS");
   }

   public void setCalcDifIcms(String calcDifIcms) {
        markAsChanged("CALCDIFICMS", calcDifIcms);
   }

   public BigDecimal getCodCfo() {
        return this.getVo().asBigDecimal("CODCFO");
   }

   public void setCodCfo(BigDecimal codCfo) {
        markAsChanged("CODCFO", codCfo);
   }

   public BigDecimal getCodCtactb() {
        return this.getVo().asBigDecimal("CODCTACTB");
   }

   public void setCodCtactb(BigDecimal codCtactb) {
        markAsChanged("CODCTACTB", codCtactb);
   }

   public String getConvProduz() {
        return this.getVo().asString("CONVPRODUZ");
   }

   public void setConvProduz(String convProduz) {
        markAsChanged("CONVPRODUZ", convProduz);
   }

   public String getDescCfo() {
        return this.getVo().asString("DESCRCFO");
   }

   public void setDescCfo(String descCfo) {
        markAsChanged("DESCRCFO", descCfo);
   }

   public BigDecimal getGrupoCfo() {
        return this.getVo().asBigDecimal("GRUPOCFO");
   }

   public void setGrupoCfo(BigDecimal grupoCfo) {
        markAsChanged("GRUPOCFO", grupoCfo);
   }

   public String getTipIcms() {
        return this.getVo().asString("TIPICMS");
   }

   public void setTipIcms(String tipIcms) {
        markAsChanged("TIPICMS", tipIcms);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTributadasCiap() {
        return this.getVo().asString("TRIBUTADASCIAP");
   }

   public void setTributadasCiap(String tributadasCiap) {
        markAsChanged("TRIBUTADASCIAP", tributadasCiap);
   }

   public String getTipoPerProdEpe() {
        return this.getVo().asString("TIPOPERPRODEPE");
   }

   public void setTipoPerProdEpe(String tipoPerProdEpe) {
        markAsChanged("TIPOPERPRODEPE", tipoPerProdEpe);
   }

   public String getRecBrutaEfdBlocOp() {
        return this.getVo().asString("RECBRUTAEFDBLOCOP");
   }

   public void setRecBrutaEfdBlocOp(String recBrutaEfdBlocOp) {
        markAsChanged("RECBRUTAEFDBLOCOP", recBrutaEfdBlocOp);
   }

   public String getMovimFisica() {
        return this.getVo().asString("MOVIMFISICA");
   }

   public void setMovimFisica(String movimFisica) {
        markAsChanged("MOVIMFISICA", movimFisica);
   }

   public String getEmpCodSit08Efd() {
        return this.getVo().asString("EMPCODSIT08EFD");
   }

   public void setEmpCodSit08Efd(String empCodSit08Efd) {
        markAsChanged("EMPCODSIT08EFD", empCodSit08Efd);
   }

   public String getRecBrutaCiap() {
        return this.getVo().asString("RECBRUTACIAP");
   }

   public void setRecBrutaCiap(String recBrutaCiap) {
        markAsChanged("RECBRUTACIAP", recBrutaCiap);
   }

   public String getDesconsiderarCfoReg47() {
        return this.getVo().asString("DESCONSIDERARCFOREG47");
   }

   public void setDesconsiderarCfoReg47(String desconsiderarCfoReg47) {
        markAsChanged("DESCONSIDERARCFOREG47", desconsiderarCfoReg47);
   }

   @Override
   public String getTableName() {
        return "TGFCFO";
   }

   @Override
   public String getEntityName() {
        return "ClassificacaoFiscalOperacao";
   }

   @Override
   public ClassificacaoFiscalOperacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
