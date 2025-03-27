package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RetContribServicoTomado extends AbstractSankhyaEntity<RetContribServicoTomado> {
   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public String getCnpjPrestador() {
        return this.getVo().asString("CNPJPRESTADOR");
   }

   public void setCnpjPrestador(String cnpjPrestador) {
        markAsChanged("CNPJPRESTADOR", cnpjPrestador);
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

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public String getIdEvento() {
        return this.getVo().asString("IDEVENTO");
   }

   public void setIdEvento(String idEvento) {
        markAsChanged("IDEVENTO", idEvento);
   }

   public BigDecimal getIndCprb() {
        return this.getVo().asBigDecimal("INDCPRB");
   }

   public void setIndCprb(BigDecimal indCprb) {
        markAsChanged("INDCPRB", indCprb);
   }

   public BigDecimal getIndObra() {
        return this.getVo().asBigDecimal("INDOBRA");
   }

   public void setIndObra(BigDecimal indObra) {
        markAsChanged("INDOBRA", indObra);
   }

   public String getNrInsc() {
        return this.getVo().asString("NRINSC");
   }

   public void setNrInsc(String nrInsc) {
        markAsChanged("NRINSC", nrInsc);
   }

   public String getNrInscEstab() {
        return this.getVo().asString("NRINSCESTAB");
   }

   public void setNrInscEstab(String nrInscEstab) {
        markAsChanged("NRINSCESTAB", nrInscEstab);
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

   public BigDecimal getTpInscEstab() {
        return this.getVo().asBigDecimal("TPINSCESTAB");
   }

   public void setTpInscEstab(BigDecimal tpInscEstab) {
        markAsChanged("TPINSCESTAB", tpInscEstab);
   }

   public BigDecimal getVlrTotalBaseRet() {
        return this.getVo().asBigDecimal("VLRTOTALBASERET");
   }

   public void setVlrTotalBaseRet(BigDecimal vlrTotalBaseRet) {
        markAsChanged("VLRTOTALBASERET", vlrTotalBaseRet);
   }

   public BigDecimal getVlrTotalBruto() {
        return this.getVo().asBigDecimal("VLRTOTALBRUTO");
   }

   public void setVlrTotalBruto(BigDecimal vlrTotalBruto) {
        markAsChanged("VLRTOTALBRUTO", vlrTotalBruto);
   }

   public BigDecimal getVlrTotalNretAdic() {
        return this.getVo().asBigDecimal("VLRTOTALNRETADIC");
   }

   public void setVlrTotalNretAdic(BigDecimal vlrTotalNretAdic) {
        markAsChanged("VLRTOTALNRETADIC", vlrTotalNretAdic);
   }

   public BigDecimal getVlrTotalNretPrinc() {
        return this.getVo().asBigDecimal("VLRTOTALNRETPRINC");
   }

   public void setVlrTotalNretPrinc(BigDecimal vlrTotalNretPrinc) {
        markAsChanged("VLRTOTALNRETPRINC", vlrTotalNretPrinc);
   }

   public BigDecimal getVlrTotalRetAdic() {
        return this.getVo().asBigDecimal("VLRTOTALRETADIC");
   }

   public void setVlrTotalRetAdic(BigDecimal vlrTotalRetAdic) {
        markAsChanged("VLRTOTALRETADIC", vlrTotalRetAdic);
   }

   public BigDecimal getVlrTotalRetPrinc() {
        return this.getVo().asBigDecimal("VLRTOTALRETPRINC");
   }

   public void setVlrTotalRetPrinc(BigDecimal vlrTotalRetPrinc) {
        markAsChanged("VLRTOTALRETPRINC", vlrTotalRetPrinc);
   }

   public String getCnpjPrestadorRet() {
        return this.getVo().asString("CNPJPRESTADORRET");
   }

   public void setCnpjPrestadorRet(String cnpjPrestadorRet) {
        markAsChanged("CNPJPRESTADORRET", cnpjPrestadorRet);
   }

   public BigDecimal getCodEmpEstab() {
        return this.getVo().asBigDecimal("CODEMPESTAB");
   }

   public void setCodEmpEstab(BigDecimal codEmpEstab) {
        markAsChanged("CODEMPESTAB", codEmpEstab);
   }

   public BigDecimal getCodParcPrestador() {
        return this.getVo().asBigDecimal("CODPARCPRESTADOR");
   }

   public void setCodParcPrestador(BigDecimal codParcPrestador) {
        markAsChanged("CODPARCPRESTADOR", codParcPrestador);
   }

   public char[] getDataChange() {
        return this.getVo().asClob("DATACHANGE");
   }

   public void setDataChange(char[] dataChange) {
        markAsChanged("DATACHANGE", dataChange);
   }

   public char[] getMsg() {
        return this.getVo().asClob("MSG");
   }

   public void setMsg(char[] msg) {
        markAsChanged("MSG", msg);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getVlrCrTom() {
        return this.getVo().asBigDecimal("VLRCRTOM");
   }

   public void setVlrCrTom(BigDecimal vlrCrTom) {
        markAsChanged("VLRCRTOM", vlrCrTom);
   }

   public BigDecimal getVlrCrTomRet() {
        return this.getVo().asBigDecimal("VLRCRTOMRET");
   }

   public void setVlrCrTomRet(BigDecimal vlrCrTomRet) {
        markAsChanged("VLRCRTOMRET", vlrCrTomRet);
   }

   public BigDecimal getVlrCrTomSusp() {
        return this.getVo().asBigDecimal("VLRCRTOMSUSP");
   }

   public void setVlrCrTomSusp(BigDecimal vlrCrTomSusp) {
        markAsChanged("VLRCRTOMSUSP", vlrCrTomSusp);
   }

   public BigDecimal getVlrCrTomSuspRet() {
        return this.getVo().asBigDecimal("VLRCRTOMSUSPRET");
   }

   public void setVlrCrTomSuspRet(BigDecimal vlrCrTomSuspRet) {
        markAsChanged("VLRCRTOMSUSPRET", vlrCrTomSuspRet);
   }

   public BigDecimal getVlrTotalBaseRetRet() {
        return this.getVo().asBigDecimal("VLRTOTALBASERETRET");
   }

   public void setVlrTotalBaseRetRet(BigDecimal vlrTotalBaseRetRet) {
        markAsChanged("VLRTOTALBASERETRET", vlrTotalBaseRetRet);
   }

   public BigDecimal getVlrTotalDifRet() {
        return this.getVo().asBigDecimal("VLRTOTALDIFRET");
   }

   public void setVlrTotalDifRet(BigDecimal vlrTotalDifRet) {
        markAsChanged("VLRTOTALDIFRET", vlrTotalDifRet);
   }

   public BigDecimal getVlrTotalNretAdicRet() {
        return this.getVo().asBigDecimal("VLRTOTALNRETADICRET");
   }

   public void setVlrTotalNretAdicRet(BigDecimal vlrTotalNretAdicRet) {
        markAsChanged("VLRTOTALNRETADICRET", vlrTotalNretAdicRet);
   }

   public BigDecimal getVlrTotalNretPrincRet() {
        return this.getVo().asBigDecimal("VLRTOTALNRETPRINCRET");
   }

   public void setVlrTotalNretPrincRet(BigDecimal vlrTotalNretPrincRet) {
        markAsChanged("VLRTOTALNRETPRINCRET", vlrTotalNretPrincRet);
   }

   public BigDecimal getVlrTotalRetAdicCalc() {
        return this.getVo().asBigDecimal("VLRTOTALRETADICCALC");
   }

   public void setVlrTotalRetAdicCalc(BigDecimal vlrTotalRetAdicCalc) {
        markAsChanged("VLRTOTALRETADICCALC", vlrTotalRetAdicCalc);
   }

   public BigDecimal getVlrTotalRetAdicDif() {
        return this.getVo().asBigDecimal("VLRTOTALRETADICDIF");
   }

   public void setVlrTotalRetAdicDif(BigDecimal vlrTotalRetAdicDif) {
        markAsChanged("VLRTOTALRETADICDIF", vlrTotalRetAdicDif);
   }

   public BigDecimal getVlrTotalRetAdicRet() {
        return this.getVo().asBigDecimal("VLRTOTALRETADICRET");
   }

   public void setVlrTotalRetAdicRet(BigDecimal vlrTotalRetAdicRet) {
        markAsChanged("VLRTOTALRETADICRET", vlrTotalRetAdicRet);
   }

   public BigDecimal getVlrTotalRetencaoCalc() {
        return this.getVo().asBigDecimal("VLRTOTALRETENCAOCALC");
   }

   public void setVlrTotalRetencaoCalc(BigDecimal vlrTotalRetencaoCalc) {
        markAsChanged("VLRTOTALRETENCAOCALC", vlrTotalRetencaoCalc);
   }

   public BigDecimal getVlrTotalRetPrincRet() {
        return this.getVo().asBigDecimal("VLRTOTALRETPRINCRET");
   }

   public void setVlrTotalRetPrincRet(BigDecimal vlrTotalRetPrincRet) {
        markAsChanged("VLRTOTALRETPRINCRET", vlrTotalRetPrincRet);
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

   @Override
   public String getTableName() {
        return "TRIRCST";
   }

   @Override
   public String getEntityName() {
        return "RetContribServicoTomado";
   }

   @Override
   public RetContribServicoTomado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
