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
        markAsChanged("BAIXA", baixa);
        this.baixa = baixa;
   }

   public BigDecimal getCodBcoPad() {
        return codBcoPad;
   }

   public void setCodBcoPad(BigDecimal codBcoPad) {
        markAsChanged("CODBCOPAD", codBcoPad);
        this.codBcoPad = codBcoPad;
   }

   public BigDecimal getCodCenCusPad() {
        return codCenCusPad;
   }

   public void setCodCenCusPad(BigDecimal codCenCusPad) {
        markAsChanged("CODCENCUSPAD", codCenCusPad);
        this.codCenCusPad = codCenCusPad;
   }

   public BigDecimal getCodCtaBcoInt() {
        return codCtaBcoInt;
   }

   public void setCodCtaBcoInt(BigDecimal codCtaBcoInt) {
        markAsChanged("CODCTABCOINT", codCtaBcoInt);
        this.codCtaBcoInt = codCtaBcoInt;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodNatPad() {
        return codNatPad;
   }

   public void setCodNatPad(BigDecimal codNatPad) {
        markAsChanged("CODNATPAD", codNatPad);
        this.codNatPad = codNatPad;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProjPad() {
        return codProjPad;
   }

   public void setCodProjPad(BigDecimal codProjPad) {
        markAsChanged("CODPROJPAD", codProjPad);
        this.codProjPad = codProjPad;
   }

   public BigDecimal getCodTipTitPad() {
        return codTipTitPad;
   }

   public void setCodTipTitPad(BigDecimal codTipTitPad) {
        markAsChanged("CODTIPTITPAD", codTipTitPad);
        this.codTipTitPad = codTipTitPad;
   }

   public BigDecimal getCodTipVenda() {
        return codTipVenda;
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
        this.codTipVenda = codTipVenda;
   }

   public String getCor() {
        return cor;
   }

   public void setCor(String cor) {
        markAsChanged("COR", cor);
        this.cor = cor;
   }

   public String getDigVenda() {
        return digVenda;
   }

   public void setDigVenda(String digVenda) {
        markAsChanged("DIGVENDA", digVenda);
        this.digVenda = digVenda;
   }

   public Timestamp getDtFix() {
        return dtFix;
   }

   public void setDtFix(Timestamp dtFix) {
        markAsChanged("DTFIX", dtFix);
        this.dtFix = dtFix;
   }

   public String getFormula() {
        return formula;
   }

   public void setFormula(String formula) {
        markAsChanged("FORMULA", formula);
        this.formula = formula;
   }

   public BigDecimal getPercentual() {
        return percentual;
   }

   public void setPercentual(BigDecimal percentual) {
        markAsChanged("PERCENTUAL", percentual);
        this.percentual = percentual;
   }

   public BigDecimal getPrazo() {
        return prazo;
   }

   public void setPrazo(BigDecimal prazo) {
        markAsChanged("PRAZO", prazo);
        this.prazo = prazo;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getTextoCentral() {
        return textoCentral;
   }

   public void setTextoCentral(String textoCentral) {
        markAsChanged("TEXTOCENTRAL", textoCentral);
        this.textoCentral = textoCentral;
   }

   public String getTipoEmp() {
        return tipoEmp;
   }

   public void setTipoEmp(String tipoEmp) {
        markAsChanged("TIPOEMP", tipoEmp);
        this.tipoEmp = tipoEmp;
   }

   public String getTipoPar() {
        return tipoPar;
   }

   public void setTipoPar(String tipoPar) {
        markAsChanged("TIPOPAR", tipoPar);
        this.tipoPar = tipoPar;
   }

   public String getTipRecDesp() {
        return tipRecDesp;
   }

   public void setTipRecDesp(String tipRecDesp) {
        markAsChanged("TIPRECDESP", tipRecDesp);
        this.tipRecDesp = tipRecDesp;
   }

   public BigDecimal getVencNaoUtil() {
        return vencNaoUtil;
   }

   public void setVencNaoUtil(BigDecimal vencNaoUtil) {
        markAsChanged("VENCNAOUTIL", vencNaoUtil);
        this.vencNaoUtil = vencNaoUtil;
   }

   public String getSomaPrazoCliente() {
        return somaPrazoCliente;
   }

   public void setSomaPrazoCliente(String somaPrazoCliente) {
        markAsChanged("SOMAPRAZOCLIENTE", somaPrazoCliente);
        this.somaPrazoCliente = somaPrazoCliente;
   }

   public BigDecimal getBasePrazo() {
        return basePrazo;
   }

   public void setBasePrazo(BigDecimal basePrazo) {
        markAsChanged("BASEPRAZO", basePrazo);
        this.basePrazo = basePrazo;
   }

   public String getParcExclusivaFcpst() {
        return parcExclusivaFcpst;
   }

   public void setParcExclusivaFcpst(String parcExclusivaFcpst) {
        markAsChanged("PARCEXCLUSIVAFCPST", parcExclusivaFcpst);
        this.parcExclusivaFcpst = parcExclusivaFcpst;
   }

   public String getTipoFin() {
        return tipoFin;
   }

   public void setTipoFin(String tipoFin) {
        markAsChanged("TIPOFIN", tipoFin);
        this.tipoFin = tipoFin;
   }

   public String getUsarDtEntSaignRe() {
        return usarDtEntSaignRe;
   }

   public void setUsarDtEntSaignRe(String usarDtEntSaignRe) {
        markAsChanged("USARDTENTSAIGNRE", usarDtEntSaignRe);
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
        this.setOriginalVO(vo);
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
