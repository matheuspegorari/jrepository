package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParcelaPagamento extends AbstractSankhyaEntity<ParcelaPagamento> {
   private String baixa;
   private BigDecimal codBcoPad;
   private BigDecimal codCenCusPad;
   private BigDecimal codCtaBcoInt;
   private BigDecimal codEmp;
   private BigDecimal codNatPad;
   private BigDecimal codParc;
   private BigDecimal codProjPad;
   private BigDecimal codTipTitPad;
   private BigDecimal codTipVenda;
   private String cor;
   private String digVenda;
   private Timestamp dtFix;
   private String formula;
   private BigDecimal percentual;
   private BigDecimal prazo;
   private BigDecimal sequencia;
   private String textoCentral;
   private String tipoEmp;
   private String tipoPar;
   private String tipRecDesp;
   private BigDecimal vencNaoUtil;
   private String somaPrazoCliente;
   private BigDecimal basePrazo;
   private String parcExclusivaFcpst;
   private String tipoFin;
   private String usarDtEntSaignRe;

   public String getBaixa() {
        return baixa;
   }

   public void setBaixa(String baixa) {
        this.baixa = baixa;
   }

   public BigDecimal getCodBcoPad() {
        return codBcoPad;
   }

   public void setCodBcoPad(BigDecimal codBcoPad) {
        this.codBcoPad = codBcoPad;
   }

   public BigDecimal getCodCenCusPad() {
        return codCenCusPad;
   }

   public void setCodCenCusPad(BigDecimal codCenCusPad) {
        this.codCenCusPad = codCenCusPad;
   }

   public BigDecimal getCodCtaBcoInt() {
        return codCtaBcoInt;
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        this.codCtaBcoInt = codCtaBcoInt;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodNatPad() {
        return codNatPad;
   }

   public void setCodNatPad(BigDecimal codNatPad) {
        this.codNatPad = codNatPad;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProjPad() {
        return codProjPad;
   }

   public void setCodProjPad(BigDecimal codProjPad) {
        this.codProjPad = codProjPad;
   }

   public BigDecimal getCodTipTitPad() {
        return codTipTitPad;
   }

   public void setCodTipTitPad(BigDecimal codTipTitPad) {
        this.codTipTitPad = codTipTitPad;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        this.codTipVenda = codTipVenda;
   }

   public String getCor() {
        return cor;
   }

   public void setCor(String cor) {
        this.cor = cor;
   }

   public String getDigVenda() {
        return digVenda;
   }

   public void setDigVenda(String digVenda) {
        this.digVenda = digVenda;
   }

   public Timestamp getDtFix() {
        return dtFix;
   }

   public void setDtFix(Timestamp dtFix) {
        this.dtFix = dtFix;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        this.formula = formula;
   }

   public BigDecimal getPercentual() {
        return percentual;
   }

   public void setPercentual(BigDecimal percentual) {
        this.percentual = percentual;
   }

   public BigDecimal getPrazo() {
        return prazo;
   }

   public void setPrazo(BigDecimal prazo) {
        this.prazo = prazo;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTextoCentral() {
        return textoCentral;
   }

   public void setTextoCentral(String textoCentral) {
        this.textoCentral = textoCentral;
   }

   public String getTipoEmp() {
        return tipoEmp;
   }

   public void setTipoEmp(String tipoEmp) {
        this.tipoEmp = tipoEmp;
   }

   public String getTipoPar() {
        return tipoPar;
   }

   public void setTipoPar(String tipoPar) {
        this.tipoPar = tipoPar;
   }

   public String getTipRecDesp() {
        return tipRecDesp;
   }

   public void setTipRecDesp(String tipRecDesp) {
        this.tipRecDesp = tipRecDesp;
   }

   public BigDecimal getVencNaoUtil() {
        return vencNaoUtil;
   }

   public void setVencNaoUtil(BigDecimal vencNaoUtil) {
        this.vencNaoUtil = vencNaoUtil;
   }

   public String getSomaPrazoCliente() {
        return somaPrazoCliente;
   }

   public void setSomaPrazoCliente(String somaPrazoCliente) {
        this.somaPrazoCliente = somaPrazoCliente;
   }

   public BigDecimal getBasePrazo() {
        return basePrazo;
   }

   public void setBasePrazo(BigDecimal basePrazo) {
        this.basePrazo = basePrazo;
   }

   public String getParcExclusivaFcpst() {
        return parcExclusivaFcpst;
   }

   public void setParcExclusivaFcpst(String parcExclusivaFcpst) {
        this.parcExclusivaFcpst = parcExclusivaFcpst;
   }

   public String getTipoFin() {
        return tipoFin;
   }

   public void setTipoFin(String tipoFin) {
        this.tipoFin = tipoFin;
   }

   public String getUsarDtEntSaignRe() {
        return usarDtEntSaignRe;
   }

   public void setUsarDtEntSaignRe(String usarDtEntSaignRe) {
        this.usarDtEntSaignRe = usarDtEntSaignRe;
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
        this.baixa = vo.asString("BAIXA");
        this.codBcoPad = vo.asBigDecimal("CODBCOPAD");
        this.codCenCusPad = vo.asBigDecimal("CODCENCUSPAD");
        this.codCtaBcoInt = vo.asBigDecimal("CODCTABCOINT");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codNatPad = vo.asBigDecimal("CODNATPAD");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProjPad = vo.asBigDecimal("CODPROJPAD");
        this.codTipTitPad = vo.asBigDecimal("CODTIPTITPAD");
        this.codTipVenda = vo.asBigDecimal("CODTIPVENDA");
        this.cor = vo.asString("COR");
        this.digVenda = vo.asString("DIGVENDA");
        this.dtFix = vo.asTimestamp("DTFIX");
        this.formula = vo.asString("FORMULA");
        this.percentual = vo.asBigDecimal("PERCENTUAL");
        this.prazo = vo.asBigDecimal("PRAZO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.textoCentral = vo.asString("TEXTOCENTRAL");
        this.tipoEmp = vo.asString("TIPOEMP");
        this.tipoPar = vo.asString("TIPOPAR");
        this.tipRecDesp = vo.asString("TIPRECDESP");
        this.vencNaoUtil = vo.asBigDecimal("VENCNAOUTIL");
        this.somaPrazoCliente = vo.asString("SOMAPRAZOCLIENTE");
        this.basePrazo = vo.asBigDecimal("BASEPRAZO");
        this.parcExclusivaFcpst = vo.asString("PARCEXCLUSIVAFCPST");
        this.tipoFin = vo.asString("TIPOFIN");
        this.usarDtEntSaignRe = vo.asString("USARDTENTSAIGNRE");
        return this;
   }
}
