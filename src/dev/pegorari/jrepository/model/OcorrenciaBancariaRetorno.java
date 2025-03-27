package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OcorrenciaBancariaRetorno extends AbstractSankhyaEntity<OcorrenciaBancariaRetorno> {
   public String getBaixaParcial() {
        return this.getVo().asString("BAIXAPARCIAL");
   }

   public void setBaixaParcial(String baixaParcial) {
        markAsChanged("BAIXAPARCIAL", baixaParcial);
   }

   public BigDecimal getCodCencus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public BigDecimal getCodNat() {
        return this.getVo().asBigDecimal("CODNAT");
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
   }

   public String getCodOcorrencia() {
        return this.getVo().asString("CODOCORRENCIA");
   }

   public void setCodOcorrencia(String codOcorrencia) {
        markAsChanged("CODOCORRENCIA", codOcorrencia);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodTipOper() {
        return this.getVo().asBigDecimal("CODTIPOPER");
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
   }

   public BigDecimal getCodTipTit() {
        return this.getVo().asBigDecimal("CODTIPTIT");
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
   }

   public String getConciliar() {
        return this.getVo().asString("CONCILIAR");
   }

   public void setConciliar(String conciliar) {
        markAsChanged("CONCILIAR", conciliar);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getInserir() {
        return this.getVo().asString("INSERIR");
   }

   public void setInserir(String inserir) {
        markAsChanged("INSERIR", inserir);
   }

   public String getInterromper() {
        return this.getVo().asString("INTERROMPER");
   }

   public void setInterromper(String interromper) {
        markAsChanged("INTERROMPER", interromper);
   }

   public String getRegistrarLog() {
        return this.getVo().asString("REGISTRARLOG");
   }

   public void setRegistrarLog(String registrarLog) {
        markAsChanged("REGISTRARLOG", registrarLog);
   }

   public String getRegistrarNossoNum() {
        return this.getVo().asString("REGISTRARNOSSONUM");
   }

   public void setRegistrarNossoNum(String registrarNossoNum) {
        markAsChanged("REGISTRARNOSSONUM", registrarNossoNum);
   }

   public String getReportar() {
        return this.getVo().asString("REPORTAR");
   }

   public void setReportar(String reportar) {
        markAsChanged("REPORTAR", reportar);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTratarOcorrencia() {
        return this.getVo().asString("TRATAROCORRENCIA");
   }

   public void setTratarOcorrencia(String tratarOcorrencia) {
        markAsChanged("TRATAROCORRENCIA", tratarOcorrencia);
   }

   public String getBaixar() {
        return this.getVo().asString("BAIXAR");
   }

   public void setBaixar(String baixar) {
        markAsChanged("BAIXAR", baixar);
   }

   public String getAlterar() {
        return this.getVo().asString("ALTERAR");
   }

   public void setAlterar(String alterar) {
        markAsChanged("ALTERAR", alterar);
   }

   public BigDecimal getCodBco() {
        return this.getVo().asBigDecimal("CODBCO");
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
   }

   public BigDecimal getCodCtaBcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
   }

   public String getRemoverMonCob() {
        return this.getVo().asString("REMOVERMONCOB");
   }

   public void setRemoverMonCob(String removerMonCob) {
        markAsChanged("REMOVERMONCOB", removerMonCob);
   }

   public String getCodOcorEmessa() {
        return this.getVo().asString("CODOCOREMESSA");
   }

   public void setCodOcorEmessa(String codOcorEmessa) {
        markAsChanged("CODOCOREMESSA", codOcorEmessa);
   }

   public String getAtualizacaoRemessa() {
        return this.getVo().asString("ATUALIZACAOREMESSA");
   }

   public void setAtualizacaoRemessa(String atualizacaoRemessa) {
        markAsChanged("ATUALIZACAOREMESSA", atualizacaoRemessa);
   }

   public BigDecimal getCodModelo() {
        return this.getVo().asBigDecimal("CODMODELO");
   }

   public void setCodModelo(BigDecimal codModelo) {
        markAsChanged("CODMODELO", codModelo);
   }

   public String getEnvPixEmail() {
        return this.getVo().asString("ENVPIXEMAIL");
   }

   public void setEnvPixEmail(String envPixEmail) {
        markAsChanged("ENVPIXEMAIL", envPixEmail);
   }

   public BigDecimal getNuRfe() {
        return this.getVo().asBigDecimal("NURFE");
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
   }

   public String getRegistrarQrCode() {
        return this.getVo().asString("REGISTRARQRCODE");
   }

   public void setRegistrarQrCode(String registrarQrCode) {
        markAsChanged("REGISTRARQRCODE", registrarQrCode);
   }

   public char[] getCamposAjustar() {
        return this.getVo().asClob("CAMPOSAJUSTAR");
   }

   public void setCamposAjustar(char[] camposAjustar) {
        markAsChanged("CAMPOSAJUSTAR", camposAjustar);
   }

   @Override
   public String getTableName() {
        return "TSIOBC";
   }

   @Override
   public String getEntityName() {
        return "OcorrenciaBancariaRetorno";
   }

   @Override
   public OcorrenciaBancariaRetorno fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
