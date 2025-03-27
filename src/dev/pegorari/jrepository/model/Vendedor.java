package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Vendedor extends AbstractSankhyaEntity<Vendedor> {
   public BigDecimal getAcrescMax() {
        return this.getVo().asBigDecimal("ACRESCMAX");
   }

   public void setAcrescMax(BigDecimal acrescMax) {
        markAsChanged("ACRESCMAX", acrescMax);
   }

   public String getApelido() {
        return this.getVo().asString("APELIDO");
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCargaHor() {
        return this.getVo().asBigDecimal("CODCARGAHOR");
   }

   public void setCodCargaHor(BigDecimal codCargaHor) {
        markAsChanged("CODCARGAHOR", codCargaHor);
   }

   public BigDecimal getCodCencusPad() {
        return this.getVo().asBigDecimal("CODCENCUSPAD");
   }

   public void setCodCencusPad(BigDecimal codCencusPad) {
        markAsChanged("CODCENCUSPAD", codCencusPad);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodForm() {
        return this.getVo().asBigDecimal("CODFORM");
   }

   public void setCodForm(BigDecimal codForm) {
        markAsChanged("CODFORM", codForm);
   }

   public BigDecimal getCodFunc() {
        return this.getVo().asBigDecimal("CODFUNC");
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
   }

   public BigDecimal getCodGer() {
        return this.getVo().asBigDecimal("CODGER");
   }

   public void setCodGer(BigDecimal codGer) {
        markAsChanged("CODGER", codGer);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public String getComCm() {
        return this.getVo().asString("COMCM");
   }

   public void setComCm(String comCm) {
        markAsChanged("COMCM", comCm);
   }

   public BigDecimal getComGer() {
        return this.getVo().asBigDecimal("COMGER");
   }

   public void setComGer(BigDecimal comGer) {
        markAsChanged("COMGER", comGer);
   }

   public BigDecimal getComVenda() {
        return this.getVo().asBigDecimal("COMVENDA");
   }

   public void setComVenda(BigDecimal comVenda) {
        markAsChanged("COMVENDA", comVenda);
   }

   public BigDecimal getDescMax() {
        return this.getVo().asBigDecimal("DESCMAX");
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
   }

   public BigDecimal getDiaCom() {
        return this.getVo().asBigDecimal("DIACOM");
   }

   public void setDiaCom(BigDecimal diaCom) {
        markAsChanged("DIACOM", diaCom);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getGrupoDescVend() {
        return this.getVo().asString("GRUPODESCVEND");
   }

   public void setGrupoDescVend(String grupoDescVend) {
        markAsChanged("GRUPODESCVEND", grupoDescVend);
   }

   public String getGrupoRetencao() {
        return this.getVo().asString("GRUPORETENCAO");
   }

   public void setGrupoRetencao(String grupoRetencao) {
        markAsChanged("GRUPORETENCAO", grupoRetencao);
   }

   public BigDecimal getParticMeta() {
        return this.getVo().asBigDecimal("PARTICMETA");
   }

   public void setParticMeta(BigDecimal particMeta) {
        markAsChanged("PARTICMETA", particMeta);
   }

   public BigDecimal getPercCusVar() {
        return this.getVo().asBigDecimal("PERCCUSVAR");
   }

   public void setPercCusVar(BigDecimal percCusVar) {
        markAsChanged("PERCCUSVAR", percCusVar);
   }

   public BigDecimal getProvAcresc() {
        return this.getVo().asBigDecimal("PROVACRESC");
   }

   public void setProvAcresc(BigDecimal provAcresc) {
        markAsChanged("PROVACRESC", provAcresc);
   }

   public String getRechRextra() {
        return this.getVo().asString("RECHREXTRA");
   }

   public void setRechRextra(String rechRextra) {
        markAsChanged("RECHREXTRA", rechRextra);
   }

   public BigDecimal getSaldoDisp() {
        return this.getVo().asBigDecimal("SALDODISP");
   }

   public void setSaldoDisp(BigDecimal saldoDisp) {
        markAsChanged("SALDODISP", saldoDisp);
   }

   public BigDecimal getSenha() {
        return this.getVo().asBigDecimal("SENHA");
   }

   public void setSenha(BigDecimal senha) {
        markAsChanged("SENHA", senha);
   }

   public String getTipCalc() {
        return this.getVo().asString("TIPCALC");
   }

   public void setTipCalc(String tipCalc) {
        markAsChanged("TIPCALC", tipCalc);
   }

   public String getTipFechCom() {
        return this.getVo().asString("TIPFECHCOM");
   }

   public void setTipFechCom(String tipFechCom) {
        markAsChanged("TIPFECHCOM", tipFechCom);
   }

   public String getTipoCertif() {
        return this.getVo().asString("TIPOCERTIF");
   }

   public void setTipoCertif(String tipoCertif) {
        markAsChanged("TIPOCERTIF", tipoCertif);
   }

   public String getTipValor() {
        return this.getVo().asString("TIPVALOR");
   }

   public void setTipValor(String tipValor) {
        markAsChanged("TIPVALOR", tipValor);
   }

   public String getTipVend() {
        return this.getVo().asString("TIPVEND");
   }

   public void setTipVend(String tipVend) {
        markAsChanged("TIPVEND", tipVend);
   }

   public BigDecimal getVlrHora() {
        return this.getVo().asBigDecimal("VLRHORA");
   }

   public void setVlrHora(BigDecimal vlrHora) {
        markAsChanged("VLRHORA", vlrHora);
   }

   public String getAtuacomprador() {
        return this.getVo().asString("ATUACOMPRADOR");
   }

   public void setAtuacomprador(String atuacomprador) {
        markAsChanged("ATUACOMPRADOR", atuacomprador);
   }

   public BigDecimal getProvAcrescCac() {
        return this.getVo().asBigDecimal("PROVACRESCCAC");
   }

   public void setProvAcrescCac(BigDecimal provAcrescCac) {
        markAsChanged("PROVACRESCCAC", provAcrescCac);
   }

   public BigDecimal getSaldoDispCac() {
        return this.getVo().asBigDecimal("SALDODISPCAC");
   }

   public void setSaldoDispCac(BigDecimal saldoDispCac) {
        markAsChanged("SALDODISPCAC", saldoDispCac);
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
        this.setVo(vo);
        return this;
   }
}
