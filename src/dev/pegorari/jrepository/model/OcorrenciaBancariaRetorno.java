package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OcorrenciaBancariaRetorno extends AbstractSankhyaEntity<OcorrenciaBancariaRetorno> {
   private String baixaParcial;
   private BigDecimal codCencus;
   private BigDecimal codEmp;
   private BigDecimal codigo;
   private BigDecimal codNat;
   private String codOcorrencia;
   private BigDecimal codParc;
   private BigDecimal codTipOper;
   private BigDecimal codTipTit;
   private String conciliar;
   private String descricao;
   private String inserir;
   private String interromper;
   private String registrarLog;
   private String registrarNossoNum;
   private String reportar;
   private BigDecimal sequencia;
   private String tratarOcorrencia;
   private String baixar;
   private String alterar;
   private BigDecimal codBco;
   private BigDecimal codCtaBcoInt;
   private String removerMonCob;
   private String codOcorEmessa;
   private String atualizacaoRemessa;
   private BigDecimal codModelo;
   private String envPixEmail;
   private BigDecimal nuRfe;
   private String registrarQrCode;
   private char[] camposAjustar;

   public String getBaixaParcial() {
        return baixaParcial;
   }

   public void setBaixaParcial(String baixaParcial) {
        markAsChanged("BAIXAPARCIAL", baixaParcial);
        this.baixaParcial = baixaParcial;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
        this.codigo = codigo;
   }

   public BigDecimal getCodNat() {
        return codNat;
   }

   public void setCodNat(BigDecimal codNat) {
        markAsChanged("CODNAT", codNat);
        this.codNat = codNat;
   }

   public String getCodOcorrencia() {
        return codOcorrencia;
   }

   public void setCodOcorrencia(String codOcorrencia) {
        markAsChanged("CODOCORRENCIA", codOcorrencia);
        this.codOcorrencia = codOcorrencia;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        markAsChanged("CODTIPOPER", codTipOper);
        this.codTipOper = codTipOper;
   }

   public BigDecimal getCodTipTit() {
        return codTipTit;
   }

   public void setCodTipTit(BigDecimal codTipTit) {
        markAsChanged("CODTIPTIT", codTipTit);
        this.codTipTit = codTipTit;
   }

   public String getConciliar() {
        return conciliar;
   }

   public void setConciliar(String conciliar) {
        markAsChanged("CONCILIAR", conciliar);
        this.conciliar = conciliar;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getInserir() {
        return inserir;
   }

   public void setInserir(String inserir) {
        markAsChanged("INSERIR", inserir);
        this.inserir = inserir;
   }

   public String getInterromper() {
        return interromper;
   }

   public void setInterromper(String interromper) {
        markAsChanged("INTERROMPER", interromper);
        this.interromper = interromper;
   }

   public String getRegistrarLog() {
        return registrarLog;
   }

   public void setRegistrarLog(String registrarLog) {
        markAsChanged("REGISTRARLOG", registrarLog);
        this.registrarLog = registrarLog;
   }

   public String getRegistrarNossoNum() {
        return registrarNossoNum;
   }

   public void setRegistrarNossoNum(String registrarNossoNum) {
        markAsChanged("REGISTRARNOSSONUM", registrarNossoNum);
        this.registrarNossoNum = registrarNossoNum;
   }

   public String getReportar() {
        return reportar;
   }

   public void setReportar(String reportar) {
        markAsChanged("REPORTAR", reportar);
        this.reportar = reportar;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTratarOcorrencia() {
        return tratarOcorrencia;
   }

   public void setTratarOcorrencia(String tratarOcorrencia) {
        markAsChanged("TRATAROCORRENCIA", tratarOcorrencia);
        this.tratarOcorrencia = tratarOcorrencia;
   }

   public String getBaixar() {
        return baixar;
   }

   public void setBaixar(String baixar) {
        markAsChanged("BAIXAR", baixar);
        this.baixar = baixar;
   }

   public String getAlterar() {
        return alterar;
   }

   public void setAlterar(String alterar) {
        markAsChanged("ALTERAR", alterar);
        this.alterar = alterar;
   }

   public BigDecimal getCodBco() {
        return codBco;
   }

   public void setCodBco(BigDecimal codBco) {
        markAsChanged("CODBCO", codBco);
        this.codBco = codBco;
   }

   public BigDecimal getCodCtaBcoInt() {
        return codCtaBcoInt;
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
        this.codCtaBcoInt = codCtaBcoInt;
   }

   public String getRemoverMonCob() {
        return removerMonCob;
   }

   public void setRemoverMonCob(String removerMonCob) {
        markAsChanged("REMOVERMONCOB", removerMonCob);
        this.removerMonCob = removerMonCob;
   }

   public String getCodOcorEmessa() {
        return codOcorEmessa;
   }

   public void setCodOcorEmessa(String codOcorEmessa) {
        markAsChanged("CODOCOREMESSA", codOcorEmessa);
        this.codOcorEmessa = codOcorEmessa;
   }

   public String getAtualizacaoRemessa() {
        return atualizacaoRemessa;
   }

   public void setAtualizacaoRemessa(String atualizacaoRemessa) {
        markAsChanged("ATUALIZACAOREMESSA", atualizacaoRemessa);
        this.atualizacaoRemessa = atualizacaoRemessa;
   }

   public BigDecimal getCodModelo() {
        return codModelo;
   }

   public void setCodModelo(BigDecimal codModelo) {
        markAsChanged("CODMODELO", codModelo);
        this.codModelo = codModelo;
   }

   public String getEnvPixEmail() {
        return envPixEmail;
   }

   public void setEnvPixEmail(String envPixEmail) {
        markAsChanged("ENVPIXEMAIL", envPixEmail);
        this.envPixEmail = envPixEmail;
   }

   public BigDecimal getNuRfe() {
        return nuRfe;
   }

   public void setNuRfe(BigDecimal nuRfe) {
        markAsChanged("NURFE", nuRfe);
        this.nuRfe = nuRfe;
   }

   public String getRegistrarQrCode() {
        return registrarQrCode;
   }

   public void setRegistrarQrCode(String registrarQrCode) {
        markAsChanged("REGISTRARQRCODE", registrarQrCode);
        this.registrarQrCode = registrarQrCode;
   }

   public char[] getCamposAjustar() {
        return camposAjustar;
   }

   public void setCamposAjustar(char[] camposAjustar) {
        markAsChanged("CAMPOSAJUSTAR", camposAjustar);
        this.camposAjustar = camposAjustar;
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
        this.setOriginalVO(vo);
        this.baixaParcial = vo.asString("BAIXAPARCIAL");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codigo = vo.asBigDecimal("CODIGO");
        this.codNat = vo.asBigDecimal("CODNAT");
        this.codOcorrencia = vo.asString("CODOCORRENCIA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.codTipTit = vo.asBigDecimal("CODTIPTIT");
        this.conciliar = vo.asString("CONCILIAR");
        this.descricao = vo.asString("DESCRICAO");
        this.inserir = vo.asString("INSERIR");
        this.interromper = vo.asString("INTERROMPER");
        this.registrarLog = vo.asString("REGISTRARLOG");
        this.registrarNossoNum = vo.asString("REGISTRARNOSSONUM");
        this.reportar = vo.asString("REPORTAR");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tratarOcorrencia = vo.asString("TRATAROCORRENCIA");
        this.baixar = vo.asString("BAIXAR");
        this.alterar = vo.asString("ALTERAR");
        this.codBco = vo.asBigDecimal("CODBCO");
        this.codCtaBcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.removerMonCob = vo.asString("REMOVERMONCOB");
        this.codOcorEmessa = vo.asString("CODOCOREMESSA");
        this.atualizacaoRemessa = vo.asString("ATUALIZACAOREMESSA");
        this.codModelo = vo.asBigDecimal("CODMODELO");
        this.envPixEmail = vo.asString("ENVPIXEMAIL");
        this.nuRfe = vo.asBigDecimal("NURFE");
        this.registrarQrCode = vo.asString("REGISTRARQRCODE");
        this.camposAjustar = vo.asClob("CAMPOSAJUSTAR");
        return this;
   }
}
