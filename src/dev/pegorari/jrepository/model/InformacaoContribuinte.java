package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoContribuinte extends AbstractSankhyaEntity<InformacaoContribuinte> {
   public String getCnpjEfr() {
        return this.getVo().asString("CNPJEFR");
   }

   public void setCnpjEfr(String cnpjEfr) {
        markAsChanged("CNPJEFR", cnpjEfr);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getCpfCtt() {
        return this.getVo().asString("CPFCTT");
   }

   public void setCpfCtt(String cpfCtt) {
        markAsChanged("CPFCTT", cpfCtt);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getEmailCtt() {
        return this.getVo().asString("EMAILCTT");
   }

   public void setEmailCtt(String emailCtt) {
        markAsChanged("EMAILCTT", emailCtt);
   }

   public Timestamp getFimValid() {
        return this.getVo().asTimestamp("FIMVALID");
   }

   public void setFimValid(Timestamp fimValid) {
        markAsChanged("FIMVALID", fimValid);
   }

   public String getFoneCel() {
        return this.getVo().asString("FONECEL");
   }

   public void setFoneCel(String foneCel) {
        markAsChanged("FONECEL", foneCel);
   }

   public String getFoneFixoCtt() {
        return this.getVo().asString("FONEFIXOCTT");
   }

   public void setFoneFixoCtt(String foneFixoCtt) {
        markAsChanged("FONEFIXOCTT", foneFixoCtt);
   }

   public String getIdeEfr() {
        return this.getVo().asString("IDEEFR");
   }

   public void setIdeEfr(String ideEfr) {
        markAsChanged("IDEEFR", ideEfr);
   }

   public String getIdEvento() {
        return this.getVo().asString("IDEVENTO");
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
   }

   public BigDecimal getIndAcordoIsenMulta() {
        return this.getVo().asBigDecimal("INDACORDOISENMULTA");
   }

   public void setIndAcordoIsenMulta(BigDecimal indAcordoIsenMulta) {
        markAsChanged("INDACORDOISENMULTA", indAcordoIsenMulta);
   }

   public BigDecimal getIndDesoneracao() {
        return this.getVo().asBigDecimal("INDDESONERACAO");
   }

   public void setIndDesoneracao(BigDecimal indDesoneracao) {
        markAsChanged("INDDESONERACAO", indDesoneracao);
   }

   public BigDecimal getIndEscrituracao() {
        return this.getVo().asBigDecimal("INDESCRITURACAO");
   }

   public void setIndEscrituracao(BigDecimal indEscrituracao) {
        markAsChanged("INDESCRITURACAO", indEscrituracao);
   }

   public BigDecimal getIndSitPj() {
        return this.getVo().asBigDecimal("INDSITPJ");
   }

   public void setIndSitPj(BigDecimal indSitPj) {
        markAsChanged("INDSITPJ", indSitPj);
   }

   public Timestamp getIniValid() {
        return this.getVo().asTimestamp("INIVALID");
   }

   public void setIniValid(Timestamp iniValid) {
        markAsChanged("INIVALID", iniValid);
   }

   public String getNmCtt() {
        return this.getVo().asString("NMCTT");
   }

   public void setNmCtt(String nmCtt) {
        markAsChanged("NMCTT", nmCtt);
   }

   public String getNrInsc() {
        return this.getVo().asString("NRINSC");
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
   }

   public String getNrRecibo() {
        return this.getVo().asString("NRORECIBO");
   }

   public void setNrRecibo(String nrRecibo) {
        markAsChanged("NRORECIBO", nrRecibo);
   }

   public String getNrReciboAnt() {
        return this.getVo().asString("NRORECIBOANT");
   }

   public void setNrReciboAnt(String nrReciboAnt) {
        markAsChanged("NRORECIBOANT", nrReciboAnt);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getStatusReg() {
        return this.getVo().asString("STATUSREG");
   }

   public void setStatusReg(String statusReg) {
        markAsChanged("STATUSREG", statusReg);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTpAmb() {
        return this.getVo().asString("TPAMB");
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
   }

   public BigDecimal getTpInsc() {
        return this.getVo().asBigDecimal("TPINSC");
   }

   public void setTpInsc(BigDecimal tpInsc) {
        markAsChanged("TPINSC", tpInsc);
   }

   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getClassTrib() {
        return this.getVo().asBigDecimal("CLASSTRIB");
   }

   public void setClassTrib(BigDecimal classTrib) {
        markAsChanged("CLASSTRIB", classTrib);
   }

   public char[] getDataChange() {
        return this.getVo().asClob("DATACHANGE");
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
   }

   public Timestamp getFimValidNovo() {
        return this.getVo().asTimestamp("FIMVALIDNOVO");
   }

   public void setFimValidNovo(Timestamp fimValidNovo) {
        markAsChanged("FIMVALIDNOVO", fimValidNovo);
   }

   public Timestamp getIniValidNovo() {
        return this.getVo().asTimestamp("INIVALIDNOVO");
   }

   public void setIniValidNovo(Timestamp iniValidNovo) {
        markAsChanged("INIVALIDNOVO", iniValidNovo);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public char[] getXmlEvento() {
        return this.getVo().asClob("XMLEVENTO");
   }

   public void setXmlEvento(char[] xmlEvento) {
        markAsChanged("XMLEVENTO", xmlEvento);
   }

   public char[] getXmlRetorno() {
        return this.getVo().asClob("XMLRETORNO");
   }

   public void setXmlRetorno(char[] xmlRetorno) {
        markAsChanged("XMLRETORNO", xmlRetorno);
   }

   public Timestamp getDtObito() {
        return this.getVo().asTimestamp("DTOBITO");
   }

   public void setDtObito(Timestamp dtObito) {
        markAsChanged("DTOBITO", dtObito);
   }

   public Timestamp getDtTransfFinsLucr() {
        return this.getVo().asTimestamp("DTTRANSFFINSLUCR");
   }

   public void setDtTransfFinsLucr(Timestamp dtTransfFinsLucr) {
        markAsChanged("DTTRANSFFINSLUCR", dtTransfFinsLucr);
   }

   public BigDecimal getIndUniao() {
        return this.getVo().asBigDecimal("INDUNIAO");
   }

   public void setIndUniao(BigDecimal indUniao) {
        markAsChanged("INDUNIAO", indUniao);
   }

   @Override
   public String getTableName() {
        return "TRIICR";
   }

   @Override
   public String getEntityName() {
        return "InformacaoContribuinte";
   }

   @Override
   public InformacaoContribuinte fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
