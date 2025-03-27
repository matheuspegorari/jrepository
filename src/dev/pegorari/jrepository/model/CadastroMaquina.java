package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CadastroMaquina extends AbstractSankhyaEntity<CadastroMaquina> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodMaq() {
        return this.getVo().asBigDecimal("CODMAQ");
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
   }

   public String getCodNacionalIdent() {
        return this.getVo().asString("CODNACIONALIDENT");
   }

   public void setCodNacionalIdent(String codNacionalIdent) {
        markAsChanged("CODNACIONALIDENT", codNacionalIdent);
   }

   public BigDecimal getFusoHorario() {
        return this.getVo().asBigDecimal("FUSOHORARIO");
   }

   public void setFusoHorario(BigDecimal fusoHorario) {
        markAsChanged("FUSOHORARIO", fusoHorario);
   }

   public String getIndLivro() {
        return this.getVo().asString("INDLIVRO");
   }

   public void setIndLivro(String indLivro) {
        markAsChanged("INDLIVRO", indLivro);
   }

   public String getMarca() {
        return this.getVo().asString("MARCA");
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
   }

   public String getMd5Paf() {
        return this.getVo().asString("MD5PAF");
   }

   public void setMd5Paf(String md5Paf) {
        markAsChanged("MD5PAF", md5Paf);
   }

   public String getModDoc() {
        return this.getVo().asString("MODDOC");
   }

   public void setModDoc(String modDoc) {
        markAsChanged("MODDOC", modDoc);
   }

   public String getTipoEcf() {
        return this.getVo().asString("TIPOECF");
   }

   public void setTipoEcf(String tipoEcf) {
        markAsChanged("TIPOECF", tipoEcf);
   }

   public String getModelo() {
        return this.getVo().asString("MODELO");
   }

   public void setModelo(String modelo) {
        markAsChanged("MODELO", modelo);
   }

   public BigDecimal getNroCaixa() {
        return this.getVo().asBigDecimal("NROCAIXA");
   }

   public void setNroCaixa(BigDecimal nroCaixa) {
        markAsChanged("NROCAIXA", nroCaixa);
   }

   public String getNroSerie() {
        return this.getVo().asString("NROSERIE");
   }

   public void setNroSerie(String nroSerie) {
        markAsChanged("NROSERIE", nroSerie);
   }

   public BigDecimal getNumUsuEcf() {
        return this.getVo().asBigDecimal("NUMUSUECF");
   }

   public void setNumUsuEcf(BigDecimal numUsuEcf) {
        markAsChanged("NUMUSUECF", numUsuEcf);
   }

   public String getTipDoc() {
        return this.getVo().asString("TIPDOC");
   }

   public void setTipDoc(String tipDoc) {
        markAsChanged("TIPDOC", tipDoc);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodEquip() {
        return this.getVo().asBigDecimal("CODEQUIP");
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
   }

   @Override
   public String getTableName() {
        return "TGFMAQ";
   }

   @Override
   public String getEntityName() {
        return "CadastroMaquina";
   }

   @Override
   public CadastroMaquina fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
