package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ViewEstoqueEnderecoWms extends AbstractSankhyaEntity<ViewEstoqueEnderecoWms> {
   private String exclConf;
   private String localizacao;
   private BigDecimal entradasPend;
   private BigDecimal estDispVolPad;
   private String bloqueado;
   private BigDecimal codAreaSep;
   private String nomeAreaSep;
   private BigDecimal estoqueVolPad;
   private BigDecimal saidasPend;
   private String descrLocal;
   private BigDecimal codProd;
   private String refForn;
   private String ativo;
   private BigDecimal pesoMax;
   private String descrGrupoProd;
   private String referencia;
   private String picking;
   private String multiProd;
   private String expedicao;
   private BigDecimal codGrupoProd;
   private BigDecimal m3Max;
   private String marca;
   private String ehDoca;
   private String complDesc;
   private BigDecimal codEmp;
   private String nomeFantasia;
   private String controle;
   private BigDecimal profundidade;
   private BigDecimal nivel;
   private BigDecimal largura;
   private BigDecimal altura;
   private BigDecimal estDisp;
   private String descrProd;
   private BigDecimal entrPendVolPad;
   private BigDecimal saidPendVolPad;
   private Timestamp dtVal;
   private String endMovVertical;
   private Timestamp dtRec;
   private BigDecimal idPalete;
   private BigDecimal codParc;
   private Timestamp dtValMinExp;
   private String observacao;
   private BigDecimal codEnd;
   private String descrEnd;
   private String endereco;
   private BigDecimal codEndPai;
   private BigDecimal codLocal;
   private String nomeParc;
   private BigDecimal estoque;
   private String codVol;
   private String codVolPad;

   public String getExclConf() {
        return exclConf;
   }

   public void setExclConf(String exclConf) {
        this.exclConf = exclConf;
   }

   public String getLocalizacao() {
        return localizacao;
   }

   public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
   }

   public BigDecimal getEntradasPend() {
        return entradasPend;
   }

   public void setEntradasPend(BigDecimal entradasPend) {
        this.entradasPend = entradasPend;
   }

   public BigDecimal getEstDispVolPad() {
        return estDispVolPad;
   }

   public void setEstDispVolPad(BigDecimal estDispVolPad) {
        this.estDispVolPad = estDispVolPad;
   }

   public String getBloqueado() {
        return bloqueado;
   }

   public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
   }

   public BigDecimal getCodAreaSep() {
        return codAreaSep;
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        this.codAreaSep = codAreaSep;
   }

   public String getNomeAreaSep() {
        return nomeAreaSep;
   }

   public void setNomeAreaSep(String nomeAreaSep) {
        this.nomeAreaSep = nomeAreaSep;
   }

   public BigDecimal getEstoqueVolPad() {
        return estoqueVolPad;
   }

   public void setEstoqueVolPad(BigDecimal estoqueVolPad) {
        this.estoqueVolPad = estoqueVolPad;
   }

   public BigDecimal getSaidasPend() {
        return saidasPend;
   }

   public void setSaidasPend(BigDecimal saidasPend) {
        this.saidasPend = saidasPend;
   }

   public String getDescrLocal() {
        return descrLocal;
   }

   public void setDescrLocal(String descrLocal) {
        this.descrLocal = descrLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getRefForn() {
        return refForn;
   }

   public void setRefForn(String refForn) {
        this.refForn = refForn;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getPesoMax() {
        return pesoMax;
   }

   public void setPesoMax(BigDecimal pesoMax) {
        this.pesoMax = pesoMax;
   }

   public String getDescrGrupoProd() {
        return descrGrupoProd;
   }

   public void setDescrGrupoProd(String descrGrupoProd) {
        this.descrGrupoProd = descrGrupoProd;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public String getPicking() {
        return picking;
   }

   public void setPicking(String picking) {
        this.picking = picking;
   }

   public String getMultiProd() {
        return multiProd;
   }

   public void setMultiProd(String multiProd) {
        this.multiProd = multiProd;
   }

   public String getExpedicao() {
        return expedicao;
   }

   public void setExpedicao(String expedicao) {
        this.expedicao = expedicao;
   }

   public BigDecimal getCodGrupoProd() {
        return codGrupoProd;
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        this.codGrupoProd = codGrupoProd;
   }

   public BigDecimal getM3Max() {
        return m3Max;
   }

   public void setM3Max(BigDecimal m3Max) {
        this.m3Max = m3Max;
   }

   public String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        this.marca = marca;
   }

   public String getEhDoca() {
        return ehDoca;
   }

   public void setEhDoca(String ehDoca) {
        this.ehDoca = ehDoca;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        this.complDesc = complDesc;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getNomeFantasia() {
        return nomeFantasia;
   }

   public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
   }

   public BigDecimal getProfundidade() {
        return profundidade;
   }

   public void setProfundidade(BigDecimal profundidade) {
        this.profundidade = profundidade;
   }

   public BigDecimal getNivel() {
        return nivel;
   }

   public void setNivel(BigDecimal nivel) {
        this.nivel = nivel;
   }

   public BigDecimal getLargura() {
        return largura;
   }

   public void setLargura(BigDecimal largura) {
        this.largura = largura;
   }

   public BigDecimal getAltura() {
        return altura;
   }

   public void setAltura(BigDecimal altura) {
        this.altura = altura;
   }

   public BigDecimal getEstDisp() {
        return estDisp;
   }

   public void setEstDisp(BigDecimal estDisp) {
        this.estDisp = estDisp;
   }

   public String getDescrProd() {
        return descrProd;
   }

   public void setDescrProd(String descrProd) {
        this.descrProd = descrProd;
   }

   public BigDecimal getEntrPendVolPad() {
        return entrPendVolPad;
   }

   public void setEntrPendVolPad(BigDecimal entrPendVolPad) {
        this.entrPendVolPad = entrPendVolPad;
   }

   public BigDecimal getSaidPendVolPad() {
        return saidPendVolPad;
   }

   public void setSaidPendVolPad(BigDecimal saidPendVolPad) {
        this.saidPendVolPad = saidPendVolPad;
   }

   public Timestamp getDtVal() {
        return dtVal;
   }

   public void setDtVal(Timestamp dtVal) {
        this.dtVal = dtVal;
   }

   public String getEndMovVertical() {
        return endMovVertical;
   }

   public void setEndMovVertical(String endMovVertical) {
        this.endMovVertical = endMovVertical;
   }

   public Timestamp getDtRec() {
        return dtRec;
   }

   public void setDtRec(Timestamp dtRec) {
        this.dtRec = dtRec;
   }

   public BigDecimal getIdPalete() {
        return idPalete;
   }

   public void setIdPalete(BigDecimal idPalete) {
        this.idPalete = idPalete;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public Timestamp getDtValMinExp() {
        return dtValMinExp;
   }

   public void setDtValMinExp(Timestamp dtValMinExp) {
        this.dtValMinExp = dtValMinExp;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        this.codEnd = codEnd;
   }

   public String getDescrEnd() {
        return descrEnd;
   }

   public void setDescrEnd(String descrEnd) {
        this.descrEnd = descrEnd;
   }

   public String getEndereco() {
        return endereco;
   }

   public void setEndereco(String endereco) {
        this.endereco = endereco;
   }

   public BigDecimal getCodEndPai() {
        return codEndPai;
   }

   public void setCodEndPai(BigDecimal codEndPai) {
        this.codEndPai = codEndPai;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        this.codLocal = codLocal;
   }

   public String getNomeParc() {
        return nomeParc;
   }

   public void setNomeParc(String nomeParc) {
        this.nomeParc = nomeParc;
   }

   public BigDecimal getEstoque() {
        return estoque;
   }

   public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        this.codVol = codVol;
   }

   public String getCodVolPad() {
        return codVolPad;
   }

   public void setCodVolPad(String codVolPad) {
        this.codVolPad = codVolPad;
   }

   @Override
   public String getTableName() {
        return "VGWEST";
   }

   @Override
   public String getEntityName() {
        return "ViewEstoqueEnderecoWms";
   }

   @Override
   public ViewEstoqueEnderecoWms fromVO(DynamicVO vo) {
        this.exclConf = vo.asString("EXCLCONF");
        this.localizacao = vo.asString("LOCALIZACAO");
        this.entradasPend = vo.asBigDecimal("ENTRADASPEND");
        this.estDispVolPad = vo.asBigDecimal("ESTDISPVOLPAD");
        this.bloqueado = vo.asString("BLOQUEADO");
        this.codAreaSep = vo.asBigDecimal("CODAREASEP");
        this.nomeAreaSep = vo.asString("NOMEAREASEP");
        this.estoqueVolPad = vo.asBigDecimal("ESTOQUEVOLPAD");
        this.saidasPend = vo.asBigDecimal("SAIDASPEND");
        this.descrLocal = vo.asString("DESCRLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.refForn = vo.asString("REFFORN");
        this.ativo = vo.asString("ATIVO");
        this.pesoMax = vo.asBigDecimal("PESOMAX");
        this.descrGrupoProd = vo.asString("DESCRGRUPOPROD");
        this.referencia = vo.asString("REFERENCIA");
        this.picking = vo.asString("PICKING");
        this.multiProd = vo.asString("MULTIPROD");
        this.expedicao = vo.asString("EXPEDICAO");
        this.codGrupoProd = vo.asBigDecimal("CODGRUPOPROD");
        this.m3Max = vo.asBigDecimal("M3MAX");
        this.marca = vo.asString("MARCA");
        this.ehDoca = vo.asString("EHDOCA");
        this.complDesc = vo.asString("COMPLDESC");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.nomeFantasia = vo.asString("NOMEFANTASIA");
        this.controle = vo.asString("CONTROLE");
        this.profundidade = vo.asBigDecimal("PROFUNDIDADE");
        this.nivel = vo.asBigDecimal("NIVEL");
        this.largura = vo.asBigDecimal("LARGURA");
        this.altura = vo.asBigDecimal("ALTURA");
        this.estDisp = vo.asBigDecimal("ESTDISP");
        this.descrProd = vo.asString("DESCRPROD");
        this.entrPendVolPad = vo.asBigDecimal("ENTRPENDVOLPAD");
        this.saidPendVolPad = vo.asBigDecimal("SAIDPENDVOLPAD");
        this.dtVal = vo.asTimestamp("DTVAL");
        this.endMovVertical = vo.asString("ENDMOVVERTICAL");
        this.dtRec = vo.asTimestamp("DTREC");
        this.idPalete = vo.asBigDecimal("IDPALETE");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.dtValMinExp = vo.asTimestamp("DTVALMINEXP");
        this.observacao = vo.asString("OBSERVACAO");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.descrEnd = vo.asString("DESCREND");
        this.endereco = vo.asString("ENDERECO");
        this.codEndPai = vo.asBigDecimal("CODENDPAI");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.nomeParc = vo.asString("NOMEPARC");
        this.estoque = vo.asBigDecimal("ESTOQUE");
        this.codVol = vo.asString("CODVOL");
        this.codVolPad = vo.asString("CODVOLPAD");
        return this;
   }
}
