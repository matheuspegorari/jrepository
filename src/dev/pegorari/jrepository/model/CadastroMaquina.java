package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CadastroMaquina extends AbstractSankhyaEntity<CadastroMaquina> {
   private BigDecimal codEmp;
   private BigDecimal codMaq;
   private String codNacionalIdent;
   private BigDecimal fusoHorario;
   private String indLivro;
   private String marca;
   private String md5Paf;
   private String modDoc;
   private String tipoEcf;
   private String modelo;
   private BigDecimal nroCaixa;
   private String nroSerie;
   private BigDecimal numUsuEcf;
   private String tipDoc;
   private String ativo;
   private BigDecimal codEquip;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMaq() {
        return codMaq;
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
        this.codMaq = codMaq;
   }

   public String getCodNacionalIdent() {
        return codNacionalIdent;
   }

   public void setCodNacionalIdent(String codNacionalIdent) {
        markAsChanged("CODNACIONALIDENT", codNacionalIdent);
        this.codNacionalIdent = codNacionalIdent;
   }

   public BigDecimal getFusoHorario() {
        return fusoHorario;
   }

   public void setFusoHorario(BigDecimal fusoHorario) {
        markAsChanged("FUSOHORARIO", fusoHorario);
        this.fusoHorario = fusoHorario;
   }

   public String getIndLivro() {
        return indLivro;
   }

   public void setIndLivro(String indLivro) {
        markAsChanged("INDLIVRO", indLivro);
        this.indLivro = indLivro;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        markAsChanged("MARCA", marca);
        this.marca = marca;
   }

   public String getMd5Paf() {
        return md5Paf;
   }

   public void setMd5Paf(String md5Paf) {
        markAsChanged("MD5PAF", md5Paf);
        this.md5Paf = md5Paf;
   }

   public String getModDoc() {
        return modDoc;
   }

   public void setModDoc(String modDoc) {
        markAsChanged("MODDOC", modDoc);
        this.modDoc = modDoc;
   }

   public String getTipoEcf() {
        return tipoEcf;
   }

   public void setTipoEcf(String tipoEcf) {
        markAsChanged("TIPOECF", tipoEcf);
        this.tipoEcf = tipoEcf;
   }

   public String getModelo() {
        return modelo;
   }

   public void setModelo(String modelo) {
        markAsChanged("MODELO", modelo);
        this.modelo = modelo;
   }

   public BigDecimal getNroCaixa() {
        return nroCaixa;
   }

   public void setNroCaixa(BigDecimal nroCaixa) {
        markAsChanged("NROCAIXA", nroCaixa);
        this.nroCaixa = nroCaixa;
   }

   public String getNroSerie() {
        return nroSerie;
   }

   public void setNroSerie(String nroSerie) {
        markAsChanged("NROSERIE", nroSerie);
        this.nroSerie = nroSerie;
   }

   public BigDecimal getNumUsuEcf() {
        return numUsuEcf;
   }

   public void setNumUsuEcf(BigDecimal numUsuEcf) {
        markAsChanged("NUMUSUECF", numUsuEcf);
        this.numUsuEcf = numUsuEcf;
   }

   public String getTipDoc() {
        return tipDoc;
   }

   public void setTipDoc(String tipDoc) {
        markAsChanged("TIPDOC", tipDoc);
        this.tipDoc = tipDoc;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodEquip() {
        return codEquip;
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
        this.codEquip = codEquip;
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
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMaq = vo.asBigDecimal("CODMAQ");
        this.codNacionalIdent = vo.asString("CODNACIONALIDENT");
        this.fusoHorario = vo.asBigDecimal("FUSOHORARIO");
        this.indLivro = vo.asString("INDLIVRO");
        this.marca = vo.asString("MARCA");
        this.md5Paf = vo.asString("MD5PAF");
        this.modDoc = vo.asString("MODDOC");
        this.tipoEcf = vo.asString("TIPOECF");
        this.modelo = vo.asString("MODELO");
        this.nroCaixa = vo.asBigDecimal("NROCAIXA");
        this.nroSerie = vo.asString("NROSERIE");
        this.numUsuEcf = vo.asBigDecimal("NUMUSUECF");
        this.tipDoc = vo.asString("TIPDOC");
        this.ativo = vo.asString("ATIVO");
        this.codEquip = vo.asBigDecimal("CODEQUIP");
        return this;
   }
}
