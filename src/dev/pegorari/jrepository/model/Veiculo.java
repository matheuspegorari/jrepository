package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Veiculo extends AbstractSankhyaEntity<Veiculo> {
   private BigDecimal corDenatran;
   private String corFab;
   private String descrEmpParc;
   private String distEixos;
   private String emiteExped;
   private String empParc;
   private String especieTipo;
   private BigDecimal espVei;
   private BigDecimal m3Max;
   private String marcaModelo;
   private String marcaPlaca;
   private BigDecimal maxLotacao;
   private String numMotor;
   private BigDecimal pesoMax;
   private String placa;
   private String potencia;
   private String proprio;
   private String renavam;
   private BigDecimal restricao;
   private String serial;
   private String tipFormFrete;
   private String tipInt;
   private String tipo;
   private BigDecimal tipoCombust;
   private BigDecimal tipVei;
   private String viaTransp;
   private BigDecimal vlrDeprecMensal;
   private BigDecimal vlrSegMensal;
   private String voltagem;
   private BigDecimal anoFabric;
   private BigDecimal anoMod;
   private String antt;
   private String ativo;
   private BigDecimal codParc;
   private BigDecimal codProd;
   private BigDecimal codQuest;
   private BigDecimal codVeiculo;
   private String combustivel;
   private BigDecimal condVei;
   private String condVin;
   private String cor;
   private String codBem;
   private String chassis;
   private String cmKg;
   private BigDecimal codCid;
   private BigDecimal codEmpFolha;
   private BigDecimal codFormFrete;
   private BigDecimal codFunc;
   private BigDecimal codMarcaMod;
   private BigDecimal codMotorista;
   private BigDecimal tara;
   private String tipoCar;
   private String tipoProp;
   private String tipoRod;
   private String capPotCil;
   private String categoria;
   private String afericao;
   private BigDecimal codCencus;
   private String tipoAfericao;
   private String codEmbarcacao;
   private String nomeEmbarcacao;
   private BigDecimal tipoEmbarcacao;
   private String tipoVeiculo;
   private BigDecimal codParcPropAntt;

   public BigDecimal getCorDenatran() {
        return corDenatran;
   }

   public void setCorDenatran(BigDecimal corDenatran) {
        markAsChanged("CORDENATRAN", corDenatran);
        this.corDenatran = corDenatran;
   }

   public String getCorFab() {
        return corFab;
   }

   public void setCorFab(String corFab) {
        markAsChanged("CORFAB", corFab);
        this.corFab = corFab;
   }

   public String getDescrEmpParc() {
        return descrEmpParc;
   }

   public void setDescrEmpParc(String descrEmpParc) {
        markAsChanged("DESCR_EMP_PARC", descrEmpParc);
        this.descrEmpParc = descrEmpParc;
   }

   public String getDistEixos() {
        return distEixos;
   }

   public void setDistEixos(String distEixos) {
        markAsChanged("DISTEIXOS", distEixos);
        this.distEixos = distEixos;
   }

   public String getEmiteExped() {
        return emiteExped;
   }

   public void setEmiteExped(String emiteExped) {
        markAsChanged("EMITEEXPED", emiteExped);
        this.emiteExped = emiteExped;
   }

   public String getEmpParc() {
        return empParc;
   }

   public void setEmpParc(String empParc) {
        markAsChanged("EMPPARC", empParc);
        this.empParc = empParc;
   }

   public String getEspecieTipo() {
        return especieTipo;
   }

   public void setEspecieTipo(String especieTipo) {
        markAsChanged("ESPECIETIPO", especieTipo);
        this.especieTipo = especieTipo;
   }

   public BigDecimal getEspVei() {
        return espVei;
   }

   public void setEspVei(BigDecimal espVei) {
        markAsChanged("ESPVEI", espVei);
        this.espVei = espVei;
   }

   public BigDecimal getM3Max() {
        return m3Max;
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
        this.m3Max = m3Max;
   }

   public String getMarcaModelo() {
        return marcaModelo;
   }

   public void setMarcaModelo(String marcaModelo) {
        markAsChanged("MARCAMODELO", marcaModelo);
        this.marcaModelo = marcaModelo;
   }

   public String getMarcaPlaca() {
        return marcaPlaca;
   }

   public void setMarcaPlaca(String marcaPlaca) {
        markAsChanged("MARCAPLACA", marcaPlaca);
        this.marcaPlaca = marcaPlaca;
   }

   public BigDecimal getMaxLotacao() {
        return maxLotacao;
   }

   public void setMaxLotacao(BigDecimal maxLotacao) {
        markAsChanged("MAXLOTACAO", maxLotacao);
        this.maxLotacao = maxLotacao;
   }

   public String getNumMotor() {
        return numMotor;
   }

   public void setNumMotor(String numMotor) {
        markAsChanged("NUMMOTOR", numMotor);
        this.numMotor = numMotor;
   }

   public BigDecimal getPesoMax() {
        return pesoMax;
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
        this.pesoMax = pesoMax;
   }

   public String getPlaca() {
        return placa;
   }

   public void setPlaca(String placa) {
        markAsChanged("PLACA", placa);
        this.placa = placa;
   }

   public String getPotencia() {
        return potencia;
   }

   public void setPotencia(String potencia) {
        markAsChanged("POTENCIA", potencia);
        this.potencia = potencia;
   }

   public String getProprio() {
        return proprio;
   }

   public void setProprio(String proprio) {
        markAsChanged("PROPRIO", proprio);
        this.proprio = proprio;
   }

   public String getRenavam() {
        return renavam;
   }

   public void setRenavam(String renavam) {
        markAsChanged("RENAVAM", renavam);
        this.renavam = renavam;
   }

   public BigDecimal getRestricao() {
        return restricao;
   }

   public void setRestricao(BigDecimal restricao) {
        markAsChanged("RESTRICAO", restricao);
        this.restricao = restricao;
   }

   public String getSerial() {
        return serial;
   }

   public void setSerial(String serial) {
        markAsChanged("SERIAL", serial);
        this.serial = serial;
   }

   public String getTipFormFrete() {
        return tipFormFrete;
   }

   public void setTipFormFrete(String tipFormFrete) {
        markAsChanged("TIPFORMFRETE", tipFormFrete);
        this.tipFormFrete = tipFormFrete;
   }

   public String getTipInt() {
        return tipInt;
   }

   public void setTipInt(String tipInt) {
        markAsChanged("TIPINT", tipInt);
        this.tipInt = tipInt;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getTipoCombust() {
        return tipoCombust;
   }

   public void setTipoCombust(BigDecimal tipoCombust) {
        markAsChanged("TIPOCOMBUST", tipoCombust);
        this.tipoCombust = tipoCombust;
   }

   public BigDecimal getTipVei() {
        return tipVei;
   }

   public void setTipVei(BigDecimal tipVei) {
        markAsChanged("TIPVEI", tipVei);
        this.tipVei = tipVei;
   }

   public String getViaTransp() {
        return viaTransp;
   }

   public void setViaTransp(String viaTransp) {
        markAsChanged("VIATRANSP", viaTransp);
        this.viaTransp = viaTransp;
   }

   public BigDecimal getVlrDeprecMensal() {
        return vlrDeprecMensal;
   }

   public void setVlrDeprecMensal(BigDecimal vlrDeprecMensal) {
        markAsChanged("VLRDEPRECMENSAL", vlrDeprecMensal);
        this.vlrDeprecMensal = vlrDeprecMensal;
   }

   public BigDecimal getVlrSegMensal() {
        return vlrSegMensal;
   }

   public void setVlrSegMensal(BigDecimal vlrSegMensal) {
        markAsChanged("VLRSEGMENSAL", vlrSegMensal);
        this.vlrSegMensal = vlrSegMensal;
   }

   public String getVoltagem() {
        return voltagem;
   }

   public void setVoltagem(String voltagem) {
        markAsChanged("VOLTAGEM", voltagem);
        this.voltagem = voltagem;
   }

   public BigDecimal getAnoFabric() {
        return anoFabric;
   }

   public void setAnoFabric(BigDecimal anoFabric) {
        markAsChanged("ANOFABRIC", anoFabric);
        this.anoFabric = anoFabric;
   }

   public BigDecimal getAnoMod() {
        return anoMod;
   }

   public void setAnoMod(BigDecimal anoMod) {
        markAsChanged("ANOMOD", anoMod);
        this.anoMod = anoMod;
   }

   public String getAntt() {
        return antt;
   }

   public void setAntt(String antt) {
        markAsChanged("ANTT", antt);
        this.antt = antt;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodQuest() {
        return codQuest;
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
        this.codQuest = codQuest;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
        this.codVeiculo = codVeiculo;
   }

   public String getCombustivel() {
        return combustivel;
   }

   public void setCombustivel(String combustivel) {
        markAsChanged("COMBUSTIVEL", combustivel);
        this.combustivel = combustivel;
   }

   public BigDecimal getCondVei() {
        return condVei;
   }

   public void setCondVei(BigDecimal condVei) {
        markAsChanged("CONDVEI", condVei);
        this.condVei = condVei;
   }

   public String getCondVin() {
        return condVin;
   }

   public void setCondVin(String condVin) {
        markAsChanged("CONDVIN", condVin);
        this.condVin = condVin;
   }

   public String getCor() {
        return cor;
   }

   public void setCor(String cor) {
        markAsChanged("COR", cor);
        this.cor = cor;
   }

   public String getCodBem() {
        return codBem;
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
        this.codBem = codBem;
   }

   public String getChassis() {
        return chassis;
   }

   public void setChassis(String chassis) {
        markAsChanged("CHASSIS", chassis);
        this.chassis = chassis;
   }

   public String getCmKg() {
        return cmKg;
   }

   public void setCmKg(String cmKg) {
        markAsChanged("CMKG", cmKg);
        this.cmKg = cmKg;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodEmpFolha() {
        return codEmpFolha;
   }

   public void setCodEmpFolha(BigDecimal codEmpFolha) {
        markAsChanged("CODEMPFOLHA", codEmpFolha);
        this.codEmpFolha = codEmpFolha;
   }

   public BigDecimal getCodFormFrete() {
        return codFormFrete;
   }

   public void setCodFormFrete(BigDecimal codFormFrete) {
        markAsChanged("CODFORMFRETE", codFormFrete);
        this.codFormFrete = codFormFrete;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        markAsChanged("CODFUNC", codFunc);
        this.codFunc = codFunc;
   }

   public BigDecimal getCodMarcaMod() {
        return codMarcaMod;
   }

   public void setCodMarcaMod(BigDecimal codMarcaMod) {
        markAsChanged("CODMARCAMOD", codMarcaMod);
        this.codMarcaMod = codMarcaMod;
   }

   public BigDecimal getCodMotorista() {
        return codMotorista;
   }

   public void setCodMotorista(BigDecimal codMotorista) {
        markAsChanged("CODMOTORISTA", codMotorista);
        this.codMotorista = codMotorista;
   }

   public BigDecimal getTara() {
        return tara;
   }

   public void setTara(BigDecimal tara) {
        markAsChanged("TARA", tara);
        this.tara = tara;
   }

   public String getTipoCar() {
        return tipoCar;
   }

   public void setTipoCar(String tipoCar) {
        markAsChanged("TIPOCAR", tipoCar);
        this.tipoCar = tipoCar;
   }

   public String getTipoProp() {
        return tipoProp;
   }

   public void setTipoProp(String tipoProp) {
        markAsChanged("TIPOPROP", tipoProp);
        this.tipoProp = tipoProp;
   }

   public String getTipoRod() {
        return tipoRod;
   }

   public void setTipoRod(String tipoRod) {
        markAsChanged("TIPOROD", tipoRod);
        this.tipoRod = tipoRod;
   }

   public String getCapPotCil() {
        return capPotCil;
   }

   public void setCapPotCil(String capPotCil) {
        markAsChanged("CAPPOTCIL", capPotCil);
        this.capPotCil = capPotCil;
   }

   public String getCategoria() {
        return categoria;
   }

   public void setCategoria(String categoria) {
        markAsChanged("CATEGORIA", categoria);
        this.categoria = categoria;
   }

   public String getAfericao() {
        return afericao;
   }

   public void setAfericao(String afericao) {
        markAsChanged("AFERICAO", afericao);
        this.afericao = afericao;
   }

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public String getTipoAfericao() {
        return tipoAfericao;
   }

   public void setTipoAfericao(String tipoAfericao) {
        markAsChanged("TIPOAFERICAO", tipoAfericao);
        this.tipoAfericao = tipoAfericao;
   }

   public String getCodEmbarcacao() {
        return codEmbarcacao;
   }

   public void setCodEmbarcacao(String codEmbarcacao) {
        markAsChanged("CODEMBARCACAO", codEmbarcacao);
        this.codEmbarcacao = codEmbarcacao;
   }

   public String getNomeEmbarcacao() {
        return nomeEmbarcacao;
   }

   public void setNomeEmbarcacao(String nomeEmbarcacao) {
        markAsChanged("NOMEEMBARCACAO", nomeEmbarcacao);
        this.nomeEmbarcacao = nomeEmbarcacao;
   }

   public BigDecimal getTipoEmbarcacao() {
        return tipoEmbarcacao;
   }

   public void setTipoEmbarcacao(BigDecimal tipoEmbarcacao) {
        markAsChanged("TIPOEMBARCACAO", tipoEmbarcacao);
        this.tipoEmbarcacao = tipoEmbarcacao;
   }

   public String getTipoVeiculo() {
        return tipoVeiculo;
   }

   public void setTipoVeiculo(String tipoVeiculo) {
        markAsChanged("TIPOVEICULO", tipoVeiculo);
        this.tipoVeiculo = tipoVeiculo;
   }

   public BigDecimal getCodParcPropAntt() {
        return codParcPropAntt;
   }

   public void setCodParcPropAntt(BigDecimal codParcPropAntt) {
        markAsChanged("CODPARCPROPANTT", codParcPropAntt);
        this.codParcPropAntt = codParcPropAntt;
   }

   @Override
   public String getTableName() {
        return "TGFVEI";
   }

   @Override
   public String getEntityName() {
        return "Veiculo";
   }

   @Override
   public Veiculo fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.corDenatran = vo.asBigDecimal("CORDENATRAN");
        this.corFab = vo.asString("CORFAB");
        this.descrEmpParc = vo.asString("DESCR_EMP_PARC");
        this.distEixos = vo.asString("DISTEIXOS");
        this.emiteExped = vo.asString("EMITEEXPED");
        this.empParc = vo.asString("EMPPARC");
        this.especieTipo = vo.asString("ESPECIETIPO");
        this.espVei = vo.asBigDecimal("ESPVEI");
        this.m3Max = vo.asBigDecimal("M3MAX");
        this.marcaModelo = vo.asString("MARCAMODELO");
        this.marcaPlaca = vo.asString("MARCAPLACA");
        this.maxLotacao = vo.asBigDecimal("MAXLOTACAO");
        this.numMotor = vo.asString("NUMMOTOR");
        this.pesoMax = vo.asBigDecimal("PESOMAX");
        this.placa = vo.asString("PLACA");
        this.potencia = vo.asString("POTENCIA");
        this.proprio = vo.asString("PROPRIO");
        this.renavam = vo.asString("RENAVAM");
        this.restricao = vo.asBigDecimal("RESTRICAO");
        this.serial = vo.asString("SERIAL");
        this.tipFormFrete = vo.asString("TIPFORMFRETE");
        this.tipInt = vo.asString("TIPINT");
        this.tipo = vo.asString("TIPO");
        this.tipoCombust = vo.asBigDecimal("TIPOCOMBUST");
        this.tipVei = vo.asBigDecimal("TIPVEI");
        this.viaTransp = vo.asString("VIATRANSP");
        this.vlrDeprecMensal = vo.asBigDecimal("VLRDEPRECMENSAL");
        this.vlrSegMensal = vo.asBigDecimal("VLRSEGMENSAL");
        this.voltagem = vo.asString("VOLTAGEM");
        this.anoFabric = vo.asBigDecimal("ANOFABRIC");
        this.anoMod = vo.asBigDecimal("ANOMOD");
        this.antt = vo.asString("ANTT");
        this.ativo = vo.asString("ATIVO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.combustivel = vo.asString("COMBUSTIVEL");
        this.condVei = vo.asBigDecimal("CONDVEI");
        this.condVin = vo.asString("CONDVIN");
        this.cor = vo.asString("COR");
        this.codBem = vo.asString("CODBEM");
        this.chassis = vo.asString("CHASSIS");
        this.cmKg = vo.asString("CMKG");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codEmpFolha = vo.asBigDecimal("CODEMPFOLHA");
        this.codFormFrete = vo.asBigDecimal("CODFORMFRETE");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codMarcaMod = vo.asBigDecimal("CODMARCAMOD");
        this.codMotorista = vo.asBigDecimal("CODMOTORISTA");
        this.tara = vo.asBigDecimal("TARA");
        this.tipoCar = vo.asString("TIPOCAR");
        this.tipoProp = vo.asString("TIPOPROP");
        this.tipoRod = vo.asString("TIPOROD");
        this.capPotCil = vo.asString("CAPPOTCIL");
        this.categoria = vo.asString("CATEGORIA");
        this.afericao = vo.asString("AFERICAO");
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.tipoAfericao = vo.asString("TIPOAFERICAO");
        this.codEmbarcacao = vo.asString("CODEMBARCACAO");
        this.nomeEmbarcacao = vo.asString("NOMEEMBARCACAO");
        this.tipoEmbarcacao = vo.asBigDecimal("TIPOEMBARCACAO");
        this.tipoVeiculo = vo.asString("TIPOVEICULO");
        this.codParcPropAntt = vo.asBigDecimal("CODPARCPROPANTT");
        return this;
   }
}
