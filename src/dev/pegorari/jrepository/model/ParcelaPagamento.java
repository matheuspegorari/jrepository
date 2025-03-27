package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParcelaPagamento extends AbstractSankhyaEntity<ParcelaPagamento> {
   public String getBaixa() {
        return this.getVo().asString("BAIXA");
   }

   public void setBaixa(String baixa) {
        markAsChanged("BAIXA", baixa);
   }

   public BigDecimal getCodBcoPad() {
        return this.getVo().asBigDecimal("CODBCOPAD");
   }

   public void setCodBcoPad(BigDecimal codBcoPad) {
        markAsChanged("CODBCOPAD", codBcoPad);
   }

   public BigDecimal getCodCenCusPad() {
        return this.getVo().asBigDecimal("CODCENCUSPAD");
   }

   public void setCodCenCusPad(BigDecimal codCenCusPad) {
        markAsChanged("CODCENCUSPAD", codCenCusPad);
   }

   public BigDecimal getCodCtaBcoInt() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodNatPad() {
        return this.getVo().asBigDecimal("CODNATPAD");
   }

   public void setCodNatPad(BigDecimal codNatPad) {
        markAsChanged("CODNATPAD", codNatPad);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProjPad() {
        return this.getVo().asBigDecimal("CODPROJPAD");
   }

   public void setCodProjPad(BigDecimal codProjPad) {
        markAsChanged("CODPROJPAD", codProjPad);
   }

   public BigDecimal getCodTipTitPad() {
        return this.getVo().asBigDecimal("CODTIPTITPAD");
   }

   public void setCodTipTitPad(BigDecimal codTipTitPad) {
        markAsChanged("CODTIPTITPAD", codTipTitPad);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public String getCor() {
        return this.getVo().asString("COR");
   }

   public void setCor(String cor) {
        markAsChanged("COR", cor);
   }

   public String getDigVenda() {
        return this.getVo().asString("DIGVENDA");
   }

   public void setDigVenda(String digVenda) {
        markAsChanged("DIGVENDA", digVenda);
   }

   public Timestamp getDtFix() {
        return this.getVo().asTimestamp("DTFIX");
   }

   public void setDtFix(Timestamp dtFix) {
        markAsChanged("DTFIX", dtFix);
   }

   public String getFormula() {
        return this.getVo().asString("FORMULA");
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
   }

   public BigDecimal getPercentual() {
        return this.getVo().asBigDecimal("PERCENTUAL");
   }

   public void setPercentual(BigDecimal percentual) {
        markAsChanged("PERCENTUAL", percentual);
   }

   public BigDecimal getPrazo() {
        return this.getVo().asBigDecimal("PRAZO");
   }

   public void setPrazo(BigDecimal prazo) {
        markAsChanged("PRAZO", prazo);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTextoCentral() {
        return this.getVo().asString("TEXTOCENTRAL");
   }

   public void setTextoCentral(String textoCentral) {
        markAsChanged("TEXTOCENTRAL", textoCentral);
   }

   public String getTipoEmp() {
        return this.getVo().asString("TIPOEMP");
   }

   public void setTipoEmp(String tipoEmp) {
        markAsChanged("TIPOEMP", tipoEmp);
   }

   public String getTipoPar() {
        return this.getVo().asString("TIPOPAR");
   }

   public void setTipoPar(String tipoPar) {
        markAsChanged("TIPOPAR", tipoPar);
   }

   public String getTipRecDesp() {
        return this.getVo().asString("TIPRECDESP");
   }

   public void setTipRecDesp(String tipRecDesp) {
        markAsChanged("TIPRECDESP", tipRecDesp);
   }

   public BigDecimal getVencNaoUtil() {
        return this.getVo().asBigDecimal("VENCNAOUTIL");
   }

   public void setVencNaoUtil(BigDecimal vencNaoUtil) {
        markAsChanged("VENCNAOUTIL", vencNaoUtil);
   }

   public String getSomaPrazoCliente() {
        return this.getVo().asString("SOMAPRAZOCLIENTE");
   }

   public void setSomaPrazoCliente(String somaPrazoCliente) {
        markAsChanged("SOMAPRAZOCLIENTE", somaPrazoCliente);
   }

   public BigDecimal getBasePrazo() {
        return this.getVo().asBigDecimal("BASEPRAZO");
   }

   public void setBasePrazo(BigDecimal basePrazo) {
        markAsChanged("BASEPRAZO", basePrazo);
   }

   public String getParcExclusivaFcpst() {
        return this.getVo().asString("PARCEXCLUSIVAFCPST");
   }

   public void setParcExclusivaFcpst(String parcExclusivaFcpst) {
        markAsChanged("PARCEXCLUSIVAFCPST", parcExclusivaFcpst);
   }

   public String getTipoFin() {
        return this.getVo().asString("TIPOFIN");
   }

   public void setTipoFin(String tipoFin) {
        markAsChanged("TIPOFIN", tipoFin);
   }

   public String getUsarDtEntSaignRe() {
        return this.getVo().asString("USARDTENTSAIGNRE");
   }

   public void setUsarDtEntSaignRe(String usarDtEntSaignRe) {
        markAsChanged("USARDTENTSAIGNRE", usarDtEntSaignRe);
   }

   @Override
   public String getTableName() {
        return "TGFPPG";
   }

   @Override
   public String getEntityName() {
        return "ParcelaPagamento";
   }

   @Override
   public ParcelaPagamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
