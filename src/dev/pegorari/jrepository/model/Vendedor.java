package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Vendedor extends AbstractSankhyaEntity<Vendedor> {
   private BigDecimal acrescMax;
   private String apelido;
   private String ativo;
   private BigDecimal codCargaHor;
   private BigDecimal codCencusPad;
   private BigDecimal codEmp;
   private BigDecimal codForm;
   private BigDecimal codFunc;
   private BigDecimal codGer;
   private BigDecimal codParc;
   private BigDecimal codReg;
   private BigDecimal codUsu;
   private BigDecimal codVend;
   private String comCm;
   private BigDecimal comGer;
   private BigDecimal comVenda;
   private BigDecimal descMax;
   private BigDecimal diaCom;
   private Timestamp dtAlter;
   private String email;
   private String grupoDescVend;
   private String grupoRetencao;
   private BigDecimal particMeta;
   private BigDecimal percCusVar;
   private BigDecimal provAcresc;
   private String rechRextra;
   private BigDecimal saldoDisp;
   private BigDecimal senha;
   private String tipCalc;
   private String tipFechCom;
   private String tipoCertif;
   private String tipValor;
   private String tipVend;
   private BigDecimal vlrHora;
   private String atuacomprador;
   private BigDecimal provAcrescCac;
   private BigDecimal saldoDispCac;

   public BigDecimal getAcrescMax() {
        return acrescMax;
   }

   public void setAcrescMax(BigDecimal acrescMax) {
        markAsChanged("ACRESCMAX", acrescMax);
        this.acrescMax = acrescMax;
   }

   public String getApelido() {
        return apelido;
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
        this.apelido = apelido;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodCargaHor() {
        return codCargaHor;
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
        this.codCargaHor = codCargaHor;
   }

   public BigDecimal getCodCencusPad() {
        return codCencusPad;
   }

   public void setCodCencusPad(BigDecimal codCencusPad) {
        markAsChanged("CODCENCUSPAD", codCencusPad);
        this.codCencusPad = codCencusPad;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodForm() {
        return codForm;
   }

   public void setCodForm(BigDecimal codForm) {
        markAsChanged("CODFORM", codForm);
        this.codForm = codForm;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodGer() {
        return codGer;
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
        this.codGer = codGer;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodVend() {
        return codVend;
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
        this.codVend = codVend;
   }

   public String getComCm() {
        return comCm;
   }

   public void setComCm(String comCm) {
        markAsChanged("COMCM", comCm);
        this.comCm = comCm;
   }

   public BigDecimal getComGer() {
        return comGer;
   }

   public void setComGer(BigDecimal comGer) {
        markAsChanged("COMGER", comGer);
        this.comGer = comGer;
   }

   public BigDecimal getComVenda() {
        return comVenda;
   }

   public void setComVenda(BigDecimal comVenda) {
        markAsChanged("COMVENDA", comVenda);
        this.comVenda = comVenda;
   }

   public BigDecimal getDescMax() {
        return descMax;
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
        this.descMax = descMax;
   }

   public BigDecimal getDiaCom() {
        return diaCom;
   }

   public void setDiaCom(BigDecimal diaCom) {
        markAsChanged("DIACOM", diaCom);
        this.diaCom = diaCom;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getGrupoDescVend() {
        return grupoDescVend;
   }

   public void setGrupoDescVend(String grupoDescVend) {
        markAsChanged("GRUPODESCVEND", grupoDescVend);
        this.grupoDescVend = grupoDescVend;
   }

   public String getGrupoRetencao() {
        return grupoRetencao;
   }

   public void setGrupoRetencao(String grupoRetencao) {
        markAsChanged("GRUPORETENCAO", grupoRetencao);
        this.grupoRetencao = grupoRetencao;
   }

   public BigDecimal getParticMeta() {
        return particMeta;
   }

   public void setParticMeta(BigDecimal particMeta) {
        markAsChanged("PARTICMETA", particMeta);
        this.particMeta = particMeta;
   }

   public BigDecimal getPercCusVar() {
        return percCusVar;
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
        this.percCusVar = percCusVar;
   }

   public BigDecimal getProvAcresc() {
        return provAcresc;
   }

   public void setProvAcresc(BigDecimal provAcresc) {
        markAsChanged("PROVACRESC", provAcresc);
        this.provAcresc = provAcresc;
   }

   public String getRechRextra() {
        return rechRextra;
   }

   public void setRechRextra(String rechRextra) {
        markAsChanged("RECHREXTRA", rechRextra);
        this.rechRextra = rechRextra;
   }

   public BigDecimal getSaldoDisp() {
        return saldoDisp;
   }

   public void setSaldoDisp(BigDecimal saldoDisp) {
        markAsChanged("SALDODISP", saldoDisp);
        this.saldoDisp = saldoDisp;
   }

   public BigDecimal getSenha() {
        return senha;
   }

   public void setSenha(BigDecimal senha) {
        markAsChanged("SENHA", senha);
        this.senha = senha;
   }

   public String getTipCalc() {
        return tipCalc;
   }

   public void setTipCalc(String tipCalc) {
        markAsChanged("TIPCALC", tipCalc);
        this.tipCalc = tipCalc;
   }

   public String getTipFechCom() {
        return tipFechCom;
   }

   public void setTipFechCom(String tipFechCom) {
        markAsChanged("TIPFECHCOM", tipFechCom);
        this.tipFechCom = tipFechCom;
   }

   public String getTipoCertif() {
        return tipoCertif;
   }

   public void setTipoCertif(String tipoCertif) {
        markAsChanged("TIPOCERTIF", tipoCertif);
        this.tipoCertif = tipoCertif;
   }

   public String getTipValor() {
        return tipValor;
   }

   public void setTipValor(String tipValor) {
        markAsChanged("TIPVALOR", tipValor);
        this.tipValor = tipValor;
   }

   public String getTipVend() {
        return tipVend;
   }

   public void setTipVend(String tipVend) {
        markAsChanged("TIPVEND", tipVend);
        this.tipVend = tipVend;
   }

   public BigDecimal getVlrHora() {
        return vlrHora;
   }

   public void setVlrHora(BigDecimal vlrHora) {
        markAsChanged("VLRHORA", vlrHora);
        this.vlrHora = vlrHora;
   }

   public String getAtuacomprador() {
        return atuacomprador;
   }

   public void setAtuacomprador(String atuacomprador) {
        markAsChanged("ATUACOMPRADOR", atuacomprador);
        this.atuacomprador = atuacomprador;
   }

   public BigDecimal getProvAcrescCac() {
        return provAcrescCac;
   }

   public void setProvAcrescCac(BigDecimal provAcrescCac) {
        markAsChanged("PROVACRESCCAC", provAcrescCac);
        this.provAcrescCac = provAcrescCac;
   }

   public BigDecimal getSaldoDispCac() {
        return saldoDispCac;
   }

   public void setSaldoDispCac(BigDecimal saldoDispCac) {
        markAsChanged("SALDODISPCAC", saldoDispCac);
        this.saldoDispCac = saldoDispCac;
   }

   @Override
   public String getTableName() {
        return "TGFVEN";
   }

   @Override
   public String getEntityName() {
        return "Vendedor";
   }

   @Override
   public Vendedor fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.acrescMax = vo.asBigDecimal("ACRESCMAX");
        this.apelido = vo.asString("APELIDO");
        this.ativo = vo.asString("ATIVO");
        this.codCargaHor = vo.asBigDecimal("CODCARGAHOR");
        this.codCencusPad = vo.asBigDecimal("CODCENCUSPAD");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codForm = vo.asBigDecimal("CODFORM");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codGer = vo.asBigDecimal("CODGER");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codVend = vo.asBigDecimal("CODVEND");
        this.comCm = vo.asString("COMCM");
        this.comGer = vo.asBigDecimal("COMGER");
        this.comVenda = vo.asBigDecimal("COMVENDA");
        this.descMax = vo.asBigDecimal("DESCMAX");
        this.diaCom = vo.asBigDecimal("DIACOM");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.email = vo.asString("EMAIL");
        this.grupoDescVend = vo.asString("GRUPODESCVEND");
        this.grupoRetencao = vo.asString("GRUPORETENCAO");
        this.particMeta = vo.asBigDecimal("PARTICMETA");
        this.percCusVar = vo.asBigDecimal("PERCCUSVAR");
        this.provAcresc = vo.asBigDecimal("PROVACRESC");
        this.rechRextra = vo.asString("RECHREXTRA");
        this.saldoDisp = vo.asBigDecimal("SALDODISP");
        this.senha = vo.asBigDecimal("SENHA");
        this.tipCalc = vo.asString("TIPCALC");
        this.tipFechCom = vo.asString("TIPFECHCOM");
        this.tipoCertif = vo.asString("TIPOCERTIF");
        this.tipValor = vo.asString("TIPVALOR");
        this.tipVend = vo.asString("TIPVEND");
        this.vlrHora = vo.asBigDecimal("VLRHORA");
        this.atuacomprador = vo.asString("ATUACOMPRADOR");
        this.provAcrescCac = vo.asBigDecimal("PROVACRESCCAC");
        this.saldoDispCac = vo.asBigDecimal("SALDODISPCAC");
        return this;
   }
}
